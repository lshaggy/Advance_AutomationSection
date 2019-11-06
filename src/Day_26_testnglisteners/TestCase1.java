package Day_26_testnglisteners;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase1 
{
	@Test(priority=1)
	void setup()
	{
		System.out.println("This is setup method.....");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2)
	void login()
	{
		System.out.println("This is login test....");
		Assert.assertTrue(false);
			
	}
	
	@Test(priority=3,dependsOnMethods={"login"})
	void logout()
	{
		System.out.println("This is logout method.....");
		Assert.assertTrue(false);
	}

}
