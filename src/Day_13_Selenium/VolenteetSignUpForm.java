package Day_13_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class VolenteetSignUpForm {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
		 WebDriver driver = new ChromeDriver(); // Lunch Browser
		 String baseURL = "https://goo.gl/RVdKM9/";// Assign Website in to a variable..
		 
		 driver.get(baseURL); //  Lunch Website on browser...
		 driver.manage().window().maximize(); //Maximize browser..
		 
		// System.out.println("Title of the page:"+driver.getTitle());// Get page title
		// System.out.println("The URL of the page:"+driver.getCurrentUrl());
		// System.out.println(driver.getPageSource()); // HTML PageSource code..
		 
//Input Boxes...
		 WebElement firstName = driver.findElement(By.id("RESULT_TextField-1"));
		 
		 System.out.println("Display status of firstName:"+firstName.isDisplayed());
		 System.out.println("Enable status of firstName:"+firstName.isEnabled());
		 firstName.sendKeys("Shaggy");
		 
		 driver.findElement(By.id("RESULT_TextField-2")).sendKeys("David");//Last name 
		 driver.findElement(By.id("RESULT_TextField-3")).sendKeys("348924783");// phone
		 driver.findElement(By.id("RESULT_TextField-4")).sendKeys("Canada");//Country
		 driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Toronto");//City
		 driver.findElement(By.id("RESULT_TextField-6")).sendKeys("John@gmail.com");//Email
		 
		 //driver.findElement(By.id("RESULT_TextField-3")).clear();//Clear the value
		 
  //*********  Handling Drop Downs  *********
		 WebElement ddele=driver.findElement(By.id("RESULT_RadioButton-7"));
		 Select dropdown = new Select(ddele);

//1) Count how many Options present 
		 dropdown.getOptions().size();// Number of Options present in the drop down
		 int noOfOptions = dropdown.getOptions().size();
		 System.out.println("Number of options present in Dropdown:"+noOfOptions);//Returns no of options present inside drop down

//2) Capture all the options present in Drop Down..
		 
		 List<WebElement> options = dropdown.getOptions();
		// System.out.println(options.get(1).getText()); // Retrieve a specific value from drop-down
		 
		 for(WebElement e:options)// Enhanced for loop
		 {
			 System.out.println(e.getText());// Retrieve all (Text)values of options stored in e...
		 }
		 
//3) How to Select Option from dropDown window....
		 dropdown.selectByVisibleText("Morning");  //Morning...
		 dropdown.selectByIndex(2);               //Index number of Afternoon
		 dropdown.selectByValue("Radio-2"); // By value Evening...
		 
//4) Radio Buttons and CheckBoxes...
		 
		 WebElement maleRadio =driver.findElement(By.id("RESULT_RadioButton-8_0"));
		 
		 System.out.println("Male Radio is Displayed or not?:"+maleRadio.isDisplayed());
		 System.out.println("Male Radio is Enable or not?:"+maleRadio.isEnabled());
		 
		 System.out.println("Before selecting Male Radio status is:"+maleRadio.isSelected());//False
		 
		// driver.findElement(By.id("RESULT_RadioButton-8_0")).click(); //Select Radio Male button
		 maleRadio.click();   //Select Radio Male button
		 System.out.println("After selecting Male Radio Status is:"+maleRadio.isSelected());
		 
//5) CheckBoxes...
		 driver.findElement(By.id("RESULT_CheckBox-9_0")).click();//Sunday..
		 driver.findElement(By.id("RESULT_CheckBox-9_6")).click();//Saturday..
		 
//6) Links....
		 driver.findElement(By.linkText("Software Testing Tutorials")).click();
		 driver.navigate().back(); // Go back to previous page...
		 driver.findElement(By.partialLinkText("Tools Training")).click();
		 driver.navigate().back(); // Go back to previous page...
		 driver.navigate().forward(); //Go forward
		 driver.navigate().back(); // Go back to previous page...
		 driver.navigate().refresh();
		 
//7) Close..
		 driver.close();
		 
	}

}
