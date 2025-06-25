
public class switch1{
public static void main (String [] args ) {

String plan = "Gold";

switch (plan) {
	case "Silver":
    	System.out.println("100GB Data - ₹199");
    	break;
	case "Gold":
    	System.out.println("200GB Data - ₹399");
    	break;
	case "Platinum":
    	System.out.println("Unlimited Data - ₹599");
    	break;
	default:
    	System.out.println("Invalid Plan");
}

}
}


