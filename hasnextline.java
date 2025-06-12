import java.util.Scanner;

public class hasnextline {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter lines of text (type 'exit' to stop):");

        // Loop through input and read complete lines
        while (s1.hasNextLine()) {  // Check if there's another line of input
            String line = s1.nextLine();  // Read the whole line
            if (line.equals("exit")) {
                break;  // Stop the loop if 'exit' is typed
            }
            System.out.println("You entered: " + line);
        }

        s1.close();
    }
}

