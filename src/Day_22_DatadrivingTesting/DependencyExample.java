package Day_22_DatadrivingTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample
{
	@Test
	void setup()
	{
		System.out.println("This is setup method.....");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2,dependsOnMethods= {"setup"})
	void login()
	{
		System.out.println("This is Login method.....");
		Assert.assertTrue(false);
	}
	
	@Test(priority=3,dependsOnMethods= {"login"},alwaysRun=true)
	void search()
	{
		System.out.println("This is search method.....");
		Assert.assertTrue(true);
	}
	
	@Test(priority=4,dependsOnMethods= {"login","search"})
	void advsearch()
	{
		System.out.println("This is Advsearch method.....");
		Assert.assertTrue(true);
	}
	
	@Test(priority=5,dependsOnMethods= {"login"})
	void logout()
	{
		System.out.println("This is logout method.....");
		Assert.assertTrue(true);
	}

}
