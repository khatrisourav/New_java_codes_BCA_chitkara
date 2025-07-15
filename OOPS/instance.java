
class Demo {


static {
System.out.println ("THis is static block" );
}

Demo (){

System.out.println ("this is constructor" );
}
public void show () {
System.out.println ("THis is show function " ) ;

}
{

System.out.println ("this is instance block");
}

}

public class instance {

public static void main (String [] args ){
new Demo().show();
new Demo ().show();
}

}
