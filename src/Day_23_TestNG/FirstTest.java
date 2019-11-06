package Day_23_TestNG;

import org.testng.annotations.Test;

public class FirstTest 
{
	@Test(priority=1)
	public void loginTest()
	{
		System.out.println("This is Login Test from test1....");
	}
	
	@Test(priority=2)
	public void tearDown()
	{
		System.out.println("This is Closing browser from test1....");
	}
	

	@Test(priority=0)
	public void setup()
	{
		System.out.println("This is Setup from test1....");
	}

}
