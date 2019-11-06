package Day_21_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class OrangeHrm_fileUpLoad {

	public static void main(String[] args) throws FindFailed, InterruptedException 
	{
//		System.setProperty("webdriver.gecko.driver", "C://Drivers/geckodriver-v0.24.0-win64/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C://Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php");
		driver.manage().window().maximize();
		

		// Login

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	
		Thread.sleep(5000);
		driver.navigate().refresh();
		// PIM-->Add Employee
	
		driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]")).click(); // PIM Tab
		driver.findElement(By.xpath("//*[@id=\"menu_pim_addEmployee\"]")).click(); // Add Employee
		driver.findElement(By.xpath("//*[@id=\"photofile\"]")).click(); // Choose file
		
		Thread.sleep(3000);
		
		
		//Sikuli
		
				String path="C:\\SeleniumPractice\\";
				
				Pattern fileInputTextBox=new Pattern(path+"filetxtbox.png");
				Pattern openButton=new Pattern(path+"openbtn.png");

				Screen s=new Screen();
				
				s.wait(fileInputTextBox,10);
				s.type(fileInputTextBox,path+"profilepic.jpg");
				s.click(openButton);
				
				Thread.sleep(5000);
				
							
				driver.close();

	}

}
