package Day_26_testnglisteners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class captureScreenshot 
{
	@Test
	void capturescreeen() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();//Maximize pageS
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Screenshot
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File trg=new File("C://screenshot/orangehrmhome.png");
		
		FileUtils.copyFile(src, trg);
		
		System.out.println("Screenshot has taken");
		
	}

}
