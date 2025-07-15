
import java.util.Scanner;
public class passwordcheck {
public static void main (String [] args ) {


Scanner sc = new Scanner(System.in);
String password;
int attempts = 0;

while (attempts < 3) {
	System.out.print("🔑 Enter password: ");
	password = sc.nextLine();

	if (password.equals("admin123")) {
    	System.out.println("✅ Access granted!");
    	break; // stop the loop on correct password
	}
	attempts++;
}
if (attempts == 3) {
	System.out.println("❌ Too many attempts. Locked out.");
}

}
}
