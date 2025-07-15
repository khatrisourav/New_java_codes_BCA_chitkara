class car {

int speed;
String name;
public void set (String n , int s) {
speed = s;
name =n ;
}
public void show () {
System.out.println(speed + "  "+ name);
}
}


public class two {

public static void main (String [] args ) {

car car1 = new car ();
car1.set("honda" , 100);
car1.show();
}
}
