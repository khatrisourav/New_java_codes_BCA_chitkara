class demo {

int a ;
int b ;

demo (int a , int b ) {

this.a=a;
this.b=b ;
}
void show () {
System.out.println (a +" " + b ) ; 
}

}

public class tworef {

public static void main (String [] args ) {
demo d1 = new demo(5,7) ;

d1.show();

demo d2 = new demo(10,20);
d2.show();
d2 = d1;
d2.a= 10;
d1.show();
d2.show();

}
}
