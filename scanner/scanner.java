
import java.util.Scanner;
public class scanner {

public static void main (String [] args ) {
Scanner sc = new Scanner (System.in);
System.out.println ("Enter the age");
int age = sc.nextInt();
System.out.println ( age) ;
sc.nextLine();

System.out.println ("Enter the quote");
String quote = sc.nextLine();




System.out.println (quote) ;

System.out.println ("Enter the Name");
String name = sc.next();

System.out.println (name) ;
System.out.println ("Enter the Amount");

double amount = sc.nextDouble();
System.out.println (amount);
System.out.println ("enter the boolean value" ) ;
boolean check = sc.nextBoolean();
System.out.println(check);

System.out.println ("Enter the byte number");
byte var1 = sc.nextByte();
System.out.println (var1);



}
}
