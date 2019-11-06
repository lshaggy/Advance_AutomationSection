package Day_19_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) 
	{
		String month= "June 2019"; 
		String day="20";
		
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 String baseURL = "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
		 
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.get(baseURL);
		 driver.manage().window().maximize();//Maximize WebPage..
		 
		 
		 WebElement src=driver.findElement(By.id("box6"));//Rome
		 WebElement trg=driver.findElement(By.xpath("//*[@id=\"box106\"]"));//Italy

		 Actions act =new Actions(driver);
		 
		 act.dragAndDrop(src, trg).build().perform();//Drag and Drop action
		 
		 WebElement src1=driver.findElement(By.xpath("//div[@id='box3']"));// WD
		 WebElement trg1=driver.findElement(By.id("box103"));//USA
		 
		 act.dragAndDrop(src1, trg1).build().perform();
		 
		 WebElement src2=driver.findElement(By.xpath("//div[@id='box7']"));// Madrid
		 WebElement trg2=driver.findElement(By.id("box107"));//Spain
	
		 act.dragAndDrop(src2, trg2).build().perform();
	}

}
