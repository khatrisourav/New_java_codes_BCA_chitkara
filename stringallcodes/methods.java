public class methods {
public static void main (String [] args ) {
String s = "raghuvar";
System.out.println (s.charAt(0));
String name = new String("Aniket");
String name2= new String ("Aniket");
System.out.println (s.length());

System.out.println (name.equals(name2));

System.out.println (s.substring(0,5));
System.out.println (s.toUpperCase());

StringBuffer s1 = new StringBuffer();
System.out.println (System.identityHashCode(s1));
//character array ===16
s1.append("123456789123456781234567891234567897"); //16*2+2 , 37 char[37]


System.out.println (System.identityHashCode(s1));

System.out.println (s1.capacity());

s1.append ("123456789123456781234567891234567897123456"); ////36*2+2,78///char[74]

System.out.println (s1.capacity());

}
}
