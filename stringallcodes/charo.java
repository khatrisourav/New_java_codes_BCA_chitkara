public class charo {
public static void main (String [] args ) {
String s = "hello";
String s1 = "hello";
String s2 = "hello";
System.out.println("Address of str: " + System.identityHashCode(s));
System.out.println(System.identityHashCode(s1));
System.out.println (System.identityHashCode(s2));
System.out.println (s==s1);
String s3 = new String("hello");
System.out.println (s==s3);
String s4 = new String ("hello");
System.out.println (System.identityHashCode(s3));
System.out.println (System.identityHashCode(s4));
System.out.println (s3==s4);
String name = "Sourav";
System.out.println (System.identityHashCode(name));
name = "raghu";
System.out.println (System.identityHashCode(name));
}
}
