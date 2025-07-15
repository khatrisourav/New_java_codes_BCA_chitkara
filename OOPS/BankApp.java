
class Account {
String holdername;
int balance ;

/*Account ( String name , int initialamount ) {

holdername= name;
balance = initialamount;
}
*/

public void set ( String name , int initialamount) {
holdername= name;
balance = initialamount;
}

public void show () {
System.out.println ( holdername + " "+"Balance :-" + balance ) ;
}
}



public class BankApp{

public static void main (String [] args ) {
Account acc1 = new Account () ;

acc1.set("Sourav" , 5000) ;

acc1.show();


}
}
