package Day_20_Selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyPressEventDemo {

	public static void main(String[] args) throws InterruptedException 
	
	{

		System.setProperty("webdriver.chrome.driver","C://Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/key_presses");
		
		Actions act=new Actions(driver);
		
        Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform(); //Enter
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN).build().perform(); 
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_UP).build().perform(); 
		Thread.sleep(3000);
		act.sendKeys(Keys.ESCAPE).build().perform();   
		
		act.sendKeys(Keys.CONTROL+"A").build().perform();
	//	act.sendKeys(Keys.CONTROL).build().perform();
		
	}

}
