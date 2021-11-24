package testing;
import java.util.*;

public class W4P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //instantiate Scanner class 
		int amountItems; 
		/*promt user to enter amount of items
		 */
		System.out.println("Please enter how many items you are ordering: ");
		amountItems = sc.nextInt();
		OnlineRetailer retail = new OnlineRetailer(amountItems); //instantiate our class
		retail.CalculateShippingCharge(amountItems); //call function
		System.out.println("Shipping charge = R" + retail.shipCharge);
		sc.close(); //close scanner	
	}

}
