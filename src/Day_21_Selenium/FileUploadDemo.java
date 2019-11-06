package Day_21_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



public class FileUploadDemo {


	public static void main(String[] args) throws FindFailed, InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C://Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//*[@id=\"RESULT_FileUpload-11\"]")).sendKeys("C:\\SeleniumPractice\\apple.jpg");
		
		//driver.findElement(By.xpath("//*[@id=\"RESULT_FileUpload-11\"]")).click();
		
//Sikuli implementation starts here....
		
	//	String path="C:\\Selenium_Practice\\";
		//String path="C:\\SeleniumPractice\\";
		
		
		/*Screen s=new Screen();
		
		Pattern fileInputTextBox=new Pattern("C:\\SeleniumPractice\\filetxtbox.png");
		Pattern openButton=new Pattern("C:\\SeleniumPractice\\openbtn.png");
		
		
		s.wait(fileInputTextBox,5);
		s.type(fileInputTextBox,"C:\\SeleniumPractice\\apple.jpg");
		Thread.sleep(5000);
		s.click(openButton);*/
		
		//Thread.sleep(5000);
		
	//	driver.close();
/*
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","C://Drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();


        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);

        Thread.sleep(3000);

        WebElement choosefile=driver.findElement(By.id("RESULT_FileUpload-11"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", choosefile);
      

        Thread.sleep(3000);
      //  choosefile.sendKeys("/Users/Lshaggy/Documents/Receipt.pdf"); // Location of your file
        choosefile.sendKeys("dummy.txt");
		*/ 
	}

////Users/Lshaggy/Documents/Receipt.pdf
}
