// THIS CLASS USES THE RETRY LOGIC AT TEST LEVEL.

package testseleniumpromain;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryLogictest {

	
	@Test
	public void method1()
	{
		int i=9/0;
	}   
	
	@Test
	public void method2()
	{
		Assert.assertEquals(false, true);
	}
}
