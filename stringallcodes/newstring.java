public class newstring {

public static void main (String [] args ) {

//Convert character array to a string 

/*char [] words = {'h','e','l','l','o',' ','w','o','r','l','d'};

String newone = new String (words);
System.out.println (newone);
*/

//Convert String to character array

/*String name = "Aman kumar sharma";
char [] token = name.toCharArray();

for ( int i = 0;i<token.length;i++) {
System.out.println (token[i]);
}
*/

//convert single character to string 

/*char word = 'A';
String newone= Character.toString(word);
System.out.println (newone);

*/


///String convert into words array (breaks in to array of substring)

/*String quote = "Slow,and,steady! wins!the!race";
String [] words = quote.split("");
for ( int i = 0;i<words.length;i++) {
System.out.println (words[i]);

*/

// Trim method in String (remove trailing spaces and leading)

String name = "     Aman kumar    ";
String newone= name.trim();
   System.out.println(newone);


}


}
