class Demo {
int a ;
int b ;
int f ;
Demo () {
System.out.println ( "this is the default constructor");
}
Demo (int c , int d ) {
a=c;
b=d;
}
Demo (int p, int q , int r ) {
a=p;
b=q;
f=r;
}

void show () {
System.out.println ( a + "  " + b +f  );
}
}


public class main {
public static void main (String [] args ) {
Demo d1 = new Demo () ;
d1.show();
Demo d2 = new Demo (5,7);
d2.show();
Demo d3 = new Demo (10,20,30);
d3.show();
}
}
