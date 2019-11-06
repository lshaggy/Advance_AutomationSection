package Day_18_Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablewithPagnation {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C://Drivers/chromedriver_win32/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 String baseURL = "https://seleniumeasy.com/test/table-pagination-demo.html";
		 
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.get(baseURL);
		 driver.manage().window().maximize();//Maximize WebPage..
		
		
        Thread.sleep(3000);
		
		WebElement Paging_Element=driver.findElement(By.xpath("//*[@id='myPager']"));
		
		List<WebElement> sub_links = Paging_Element.findElements(By.tagName("a")); 
		System.out.println("Total Paging Elements Are -- > " + sub_links.size()); //5

			
		if (sub_links.size() > 0) 
		{
			System.out.println("Links are Present");
	
			for (int i = 1; i < sub_links.size()-1; i++)
			  {
					WebElement link=driver.findElement(By.xpath("//a[contains(text(),'"+i+"')]"));
					//System.out.println(link.getText()); // This will print how many pages displayed
					link.click();
					
		Thread.sleep(3000);
					
//Read col1, col2 for all rows in a page
			int rows=driver.findElements(By.xpath("//*[@id='myTable']/tr")).size();
					
			for(int r=1;r<=rows;r++)//1 2 3
				{
			String col1=driver.findElement(By.xpath("//*[@id='myTable']/tr["+r+"]/td[1]")).getText();
			String col2=driver.findElement(By.xpath("//*[@id='myTable']/tr["+r+"]/td[2]")).getText();
			String col3=driver.findElement(By.xpath("//*[@id='myTable']/tr["+r+"]/td[3]")).getText();
			String col4=driver.findElement(By.xpath("//*[@id='myTable']/tr["+r+"]/td[4]")).getText();
			String col5=driver.findElement(By.xpath("//*[@id='myTable']/tr["+r+"]/td[5]")).getText();
			String col6=driver.findElement(By.xpath("//*[@id='myTable']/tr["+r+"]/td[6]")).getText();
			String col7=driver.findElement(By.xpath("//*[@id='myTable']/tr["+r+"]/td[7]")).getText();
						
				System.out.println(col1+"  "+col2+"  "+col3+"  "+col4+"  "+col5+"  "+col6+"  "+col7);
				}
									
				}
		} 
		else 
		{
			System.out.println("Links not presents");
		}

	}

}
