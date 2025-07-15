
class Account {
String holderName;
int balance;
public void set (String name , int amt ) {
holderName = name;
balance = amt ;
}

public void show () {
System.out.println ( holderName + " "+ "Balance:-" + balance); 
}

}

public class bank {

public static void main (String [] args ) {
Account acc1 = new Account () ;
acc1.set("Sourav" , 5000 ) ;

acc1.show();
}
}
