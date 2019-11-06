package Day_22_DatadrivingTesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDDTest {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C://Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://www.newtours.demoaut.com/mercurywelcome.php");
		
		driver.manage().window().maximize();
		
		
		String path="C://Selenium_Practice/Login1.xlsx";
		
		int rowcount=XLUtilities.getRowCount(path, "Sheet1");//Number of Rows

		for(int i=1;i<=rowcount;i++)
		{
			String username=XLUtilities.getCellData(path,"Sheet1",i,0);
			String password=XLUtilities.getCellData(path,"Sheet1",i,1);
			
			driver.findElement(By.name("userName")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.name("login")).click();
			
			String exp_title="Find a Flight: Mercury Tours:";
			String act_title=driver.getTitle();
	//Validation
			if(exp_title.equalsIgnoreCase(act_title))
			{
				System.out.println("Login Test Passed****");
				XLUtilities.setCellData(path, "Sheet1", i,2, "Test Passed");
			}
			else
			{
				System.out.println("Login Test Failed****");
				XLUtilities.setCellData(path,"Sheet1", i, 2, "Test Failed");
			}
			
			driver.findElement(By.linkText("Home")).click();
	}
		driver.close();

}
}
