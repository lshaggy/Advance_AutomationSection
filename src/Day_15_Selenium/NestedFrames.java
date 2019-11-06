package Day_15_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class NestedFrames {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 String baseURL = "http://demo.automationtesting.in/Frames.html";
		 

		 driver.get(baseURL);
		 driver.manage().window().maximize();//Maximize WebPage..
		 
		 driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		 WebElement outterframe=driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
	     driver.switchTo().frame(outterframe);//outer frame
	     
	     WebElement innerframe=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
	     driver.switchTo().frame(innerframe);//inner frame
	      
	     driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Selenium");
	}

}
