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
public class OnlineRetailerUnitTest2 {

	@Test
	public void ShippingChargeTest2() {
		//Arrange 
		double expectedResult = 155.5;
		double actualResult;
		int items = 50;
		OnlineRetailer ro = new OnlineRetailer(items);
		
		//Act 
		actualResult = ro.CalculateShippingCharge(items);
		
		//Assert
		assertTrue("Shipping charge calculated incorrectly", actualResult == expectedResult);
	}

}
