
class Demo {
int a ;
int b ;
int f;

Demo () {


this(5,7,8,9);
System.out.println ( "Default constrcutor called" );

}

Demo (int c , int d ) {

a=c;
b=d;
System.out.println ( "Parametrized  constrcutor called" );

}
Demo (int c , int d ,int e) {

a=c;
b=d;
f=e;
System.out.println ( "three Parametrized   constrcutor called" );

}

void show () {
System.out.println (a + " " + b+ " " +f) ;
}
}

public class thisconst {
public static void main (String [] args ) {

Demo d1 = new Demo();
d1.show();
//Demo d2 = new Demo (10,20);
//d2.show();
//Demo d3 = new Demo (100,200,300);
//d3.show();


}
}
