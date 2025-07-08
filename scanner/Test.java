import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter something: ");
        
        if (sc.hasNextInt()) {
            System.out.println("Yes, it's an int.");
        } else {
            System.out.println("No, it's not an int.");
        }

        // Now consume it (read the input again)
        String stillThere = sc.next();
        System.out.println("You typed: " + stillThere);
    }
}

