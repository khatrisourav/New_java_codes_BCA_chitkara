class demo {
int a ;
int b ;
int c ;
demo () {
this(1,2,3);
System.out.println ("Called three " );

}
demo (int f ) {
a=f;

System.out.println ("Successfully called paramterized one l constructor  " );
}

demo (int d , int e , int f ) {
a=d;
b=e;
c=f;
System.out.println ("Successfully called paramterized three constructor  " );

}


}
public class thisconst {
public static void main (String [] args ) {
demo d1 = new demo ();
System.out.println (d1.a );
demo d2 = new demo (11,22,33);
System.out.println (d2.a + " "+ d2.b+ " " + d2.c  );

}
}
