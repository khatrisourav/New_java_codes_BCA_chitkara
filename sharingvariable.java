
class Demo {

int x = 10;

}



public class sharingvariable {

public static void main (String [] args ) {

Demo d1 = new Demo ();
System.out.println ("This is the d1 x varible "+d1.x);
Demo d2 = d1;
d2.x=20;
System.out.println ("after assigning d1 to d2 and changes by d2");
System.out.println ("This is the d1 x varible "+d1.x);
System.out.println ("This is the d1 x varible "+d2.x);


}
}

