class Demo {

int x =10;
void show (){
System.out.println ("This is the marks of the students " + x);

}
void update (Demo d){
System.out.println (d.x);
}
}


public class  passingobjtomethod {

public static void main (String [] args ){
Demo d1 = new Demo ();

d1.x =20;
d1.update(d1);





}
}

