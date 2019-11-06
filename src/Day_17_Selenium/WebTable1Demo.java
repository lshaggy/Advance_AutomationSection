package Day_17_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1Demo {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 String baseURL = "http://testautomationpractice.blogspot.com/";
		 
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.get(baseURL);
		 driver.manage().window().maximize();//Maximize WebPage..
		 
//1) Count How many Rows..
		 int rows = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr")).size()-1;
		 System.out.println("Number of rows is: "+rows);//6
		 
//2) Count how many Columns...
		 int columns =driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th")).size();
         System.out.println("Number of Columns is: "+columns);//4
         
//3) Retrieve specific row and column data from the table
         String value=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[2]/td[1]")).getText();
         System.out.println("Value of retrieved data is: "+value); //Learn Selenium
         

//4) Retrieve all the data from the table [Rows & Columns]
         System.out.println("Book Name"+"   "+"Author"+"   "+"Subject"+"   "+"Price");
         System.out.println("------------------------------------------------------");
  /*       
         
         for(int r=2;r<=rows+1;r++)  //Classic for loop reading Rows
         { 
        	 for(int c=1;c<=columns;c++) //inner Classic for loop reading Columns
        	 {
        		 value=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td["+c+"]")).getText();
        		 System.out.print(value+"   "); 
        	 }
        	 System.out.println();
          } */
         
 //5) Print Book names whose Author is Mukesh..
         for(int r=2;r<=rows+1;r++)//Classic for loop for Rows
         {
        	 String Author=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td[2]")).getText();
        	// System.out.println(Author);
        	 
        	 if(Author.equals("Mukesh"))//Classic for loop for Column.
        	 {
        		 String books_name=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td[2]")).getText();
        		 System.out.println(Author+"  "+books_name);//Learn Java/ Master in Selenium
        	 }
         }
	}

}
