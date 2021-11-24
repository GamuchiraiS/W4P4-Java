/**
 * 
 */
package testing;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author gamuc
 *
 */
public class OnlineRetailerUnitTest1 {

	@Test
	public void ShippingChargeTest1() {
		//Arrange 
		double expectedResult = 37.5;
		double actualResult;
		int items = 10;
		OnlineRetailer ro = new OnlineRetailer(items);
		
		//Act 
		actualResult = ro.CalculateShippingCharge(items);
		
		//Assert
		assertTrue("Shipping charge calculated incorrectly", actualResult == expectedResult);
	}

}
