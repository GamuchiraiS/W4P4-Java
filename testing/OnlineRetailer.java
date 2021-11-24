/**
 * 
 */
package testing;

/**
 * @author gamuc
 *
 */
public class OnlineRetailer {
	public int amountItems; 
	public double firstItemRate, subItemRate, shipCharge;
	
	public OnlineRetailer(int input) {
		amountItems = input; 
		firstItemRate = 10.95;
		subItemRate = 2.95;
		shipCharge = 0.00;
	}
	/*function to calculate the shipping charge
	 */
	public double CalculateShippingCharge(int amountItems) {
		//if the user only has 1 item
			if (amountItems == 1) {
				/*Multiple amount of items
				 * by the rate for the first item (10.95)
				 */
				shipCharge = amountItems * firstItemRate;
			}
			//if the user enters a negative number 
			else if (amountItems < 0) {
				System.out.println("Please enter a valid number ");
				return shipCharge;
			}
			/*But if the user has more than one items
			 * first multiply 1 by the first item rate 
			 * then subtract 1 from the amount of items.
			 * We'll multiply that by the sub items rate.
			 * To get the total, add the calculates
			 */
			else {
				shipCharge = (1 * firstItemRate) + (amountItems - 1) * subItemRate;
			}
			/*return shipCharge
			 */
			return shipCharge;
	}
}
