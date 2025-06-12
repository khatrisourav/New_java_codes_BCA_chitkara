
import java.util.Scanner;
public class scanner {

public static void main (String [] args){

Scanner s1 = new Scanner(System.in);
System.out.println("Enter the name of student ");
 //s1.useDelimiter(",");  //our delimittr you can change it but by default is space"

//String name = s1.next(); //Next word only means u type sourav batra it will take only first sourav because it separate by space only taking first token
//String name = s1.nextLine(); //it will read whole line  sourabh batra whole line 
//System.out.println (name); //


//-----------------------now its for integer 

//int age = s1.nextInt() ;///it will take next token as a integer here token means next upcoming word



//System.out.println(age); 

////----------------now its for double
//double gpa = s1.nextDouble();
//System.out.println(gpa);



///------------------boolean 
boolean status = s1.nextBoolean();
System.out.println("Students"+ status);

s1.close(); ///after this you cant use scanner class


//String name1 = s1.next(); cant worked because we close the scanner close



}

}
