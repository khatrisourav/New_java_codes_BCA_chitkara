import java.util.Scanner;

public class hasnext {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Enter some words (type 'exit' to stop):");
        
        // Loop through the input and stop if 'exit' is typed
        while (s1.hasNext()) {
            String word = s1.next();  //it will take input from has next like aman sourav this is going in to has next and next will take aman from has next 
            if (word.equals("exit")) {
                break;
            }
            System.out.println("You entered: " + word);
        }
        
        s1.close();
    }
}

