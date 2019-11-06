package Day_13_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register_MercuryForm {

	public static void main(String[] args)
	{
//1) Open Web Browser(Chrome/IE/firefox).
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 String baseURL = "http://newtours.demoaut.com/mercuryregister.php";
		 
//2) Enter website...
		 driver.get(baseURL);
		 driver.findElement(By.linkText("REGISTER"));
//3) Fill up form
		 driver.findElement(By.name("firstName")).sendKeys("Shaggy");
		 driver.findElement(By.name("lastName")).sendKeys("Louis");
		 driver.findElement(By.name("phone")).sendKeys("4529943440");
		 driver.findElement(By.name("userName")).sendKeys("shaggy@yahoo.com");
		 driver.findElement(By.name("address1")).sendKeys("1202 Blvd Green Field");
		 driver.findElement(By.name("city")).sendKeys("Etobikoe");
		 driver.findElement(By.name("state")).sendKeys("Ontario");
		 driver.findElement(By.name("country")).sendKeys("Canada");
		 
//4)**** Handling Drop-Down and Display all Options  ****
		WebElement countries = driver.findElement(By.name("country"));
		Select DropDown = new Select(countries);
		
		DropDown.getOptions().size(); //Get Number of Options present in the drop down
		System.out.println("Number of countries in Dropdown is: "+DropDown.getOptions().size());//Show Number of Options present in the drop-down
		 
//5) Capture all the options present in Drop Down...
		List <WebElement> opt=DropDown.getOptions();
		
		for(WebElement e:opt) // Using Enhanced loop to display list of all the Countries in Dropdown 
		{
			System.out.println(e.getText());
		}
		 //login details
		 driver.findElement(By.name("email")).sendKeys("shaggy");
		 driver.findElement(By.name("password")).sendKeys("Louis");
		 driver.findElement(By.name("confirmPassword")).sendKeys("Louis");
		 driver.findElement(By.name("register")).click();
		 
//6) Verify page Title...		 
		 String Act_Title = driver.getTitle();
		 String Exp_Title = "Register: Mercury Tours";
		 
		 if(Act_Title.equals(Exp_Title))
		 {
			 System.out.println("Test Passed");
		 }
		 else
		 {
			 System.out.println("Test Failed");
		 }
		 
//7) Close browser..
		 driver.close();
				

	}

}
