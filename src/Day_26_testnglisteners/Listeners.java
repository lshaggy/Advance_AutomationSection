package Day_26_testnglisteners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter
{

	public void onTestStart(ITestResult rs)
	{
		System.out.println("onTestStart....");
	}
	
	public void onTestSuccess(ITestResult rs)
	{
		System.out.println("onTestSucess....");
	}
	public void onTestFailure(ITestResult rs)
	{
		System.out.println("onTestFailure....");
	}
	
	public void onTestSkipped(ITestResult rs)
	{
		System.out.println("onTestSkipped....");
	}

}
