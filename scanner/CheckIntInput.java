import java.util.Scanner;

public class CheckIntInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      /*  System.out.print("Enter an integer: ");
        
        if (sc.hasNextInt()) {
            int x = sc.nextInt(); // 🟢 executed only if valid integer is there
            System.out.println("You entered: " + x);
        } else {
            System.out.println("Invalid number!");
        }
        
        */
        
   /*   System.out.print("Enter an Name: ");  
      if (sc.hasNext()) {
      String name = sc.next();
      System.out.println (name + " " + "World");
      
      }
      else {
      System.out.println("This is invalid" );
      }
      */
      
        System.out.print("Enter a double: ");
        
        if (sc.hasNextDouble()) {
            double  x = sc.nextDouble(); // 🟢 executed only if valid integer is there
            System.out.println("You entered: " + x);
        } else {
            System.out.println("Invalid number!");
        }
        
        
      
    }
    
}

