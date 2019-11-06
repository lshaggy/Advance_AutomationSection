package Day_24_AnnotationDemo;

import org.testng.annotations.*;

public class TC2 
{
	@BeforeClass
	void beforeClass()
	{
		System.out.println("This is beforeClass....");
	}
	
	@AfterClass
	void afterClass()
	{
		System.out.println("This is afterClass....");
	}
	
	@BeforeMethod
	void beforeMethod()
	{
		System.out.println("This is beforeMethod.....");
	}
	
	@AfterMethod
	void afterMethod()
	{
		System.out.println("This is AfterMethod.........");
	}
	
	@Test
	void test3()
	{
		System.out.println("This is test3");
	}
	
	@Test
	void test4()
	{
		System.out.println("This is test4");
	}
	
	///////////////////////
	
	@BeforeSuite
	void beforeSuite()
	{
		System.out.println("Thi is befoeSuite....");
	}
	
	
	@AfterSuite
	void afterSuite()
	{
		System.out.println("Thi is befoeSuite....");
	}

}
