package Day_16;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindow {

	public static void main(String[] args) 
	{ 
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 String baseURL = "http://demo.automationtesting.in/Windows.html";
		 
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.get(baseURL);
		 driver.manage().window().maximize();//Maximize WebPage..
		 
	//	 String handle=driver.getWindowHandle();
	//	 System.out.println(handle); //CDwindow-72BC25CC2E3FE1A28C2EF4B22951EDA3
		 
		 driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();//Open another window
		 
		 Set<String> handles=driver.getWindowHandles();
		 
		 for(String h:handles)//Enhanced for loop retrieving all handles values..
		 {
			 String title=driver.switchTo().window(h).getTitle();
			 System.out.println(title);//1) Frames & windows 2)Sakinalium | Home
			 
			
			 if(title.equals("Sakinalium | Home"))
			 {
				 driver.findElement(By.xpath("//*[@id=\"container\"]/header/div/div/div[2]/ul/li[4]/a")).click();
			 }
		 }

		 driver.close();// Close single page
		 //driver.quit();// Close all pages on browser
	}

}
