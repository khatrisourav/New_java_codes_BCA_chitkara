class Demo {
int x;
Demo (int x ){

this.x=x;
}

}

public class automaticgarbage {

public static void main (String [] args ){

Demo d1 = new Demo (10);
Demo d2 = new Demo (20);
System.out.println ("D1 . x =" + d1.x + "D2.x" +d2.x);
d1 =d2 ;
System.out.println ("D1 . x =" + d1.x + "D2.x" +d2.x);
}
}
