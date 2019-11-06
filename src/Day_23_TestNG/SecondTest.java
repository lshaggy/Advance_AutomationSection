package Day_23_TestNG;

import org.testng.annotations.Test;

public class SecondTest 
{
	@Test(priority=3)
	public void setup()
	{
		System.out.println("This is Setup from 2nd test....");
	}
	
	@Test(priority=4)
	public void searchTest()
	{
		System.out.println("This is Login Test from 2nd test....");
	}
	
	@Test(priority=5)
	public void tearDown()
	{
		System.out.println("This is Closing browser from 2nd test....");
	}

}
