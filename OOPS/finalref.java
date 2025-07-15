class Demo {

int a =45;
}

public class finalref {


public static void main (String [] args ) {

final Demo d1 = new Demo ();
Demo d2 = new Demo ();
d1.a=56;;
System.out.println (d1.a);
}


}
