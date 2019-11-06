package Day_20_Selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFilesUsingFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException
	{
		//Broswer Profile
		
				FirefoxProfile profile=new FirefoxProfile();
				
				profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain,application/pdf"); // set Mime type according to your file format
				profile.setPreference("browser.download.manager.showWhenStarting", false);
				profile.setPreference("pdfjs.disabled", true); // only for pdf file
				
				FirefoxOptions option=new FirefoxOptions();
				option.setProfile(profile);
				
				//End of code
						
				System.setProperty("webdriver.gecko.driver","C://Drivers/geckodriver-v0.23.0-win64/geckodriver.exe");
				WebDriver driver=new FirefoxDriver(option);  // cap object we need pass
				
				driver.get("http://demo.automationtesting.in/FileDownload.html");
				
				driver.manage().window().maximize();
				
				//text file
				driver.findElement(By.id("textbox")).sendKeys("testing");//text box
				driver.findElement(By.id("createTxt")).click(); //Generate File
				driver.findElement(By.id("link-to-download")).click(); //download link
				
				Thread.sleep(5000);
				
				if(isFileExist("C://Users/admin/Downloads/info.txt")==true)
				{
					System.out.println("Text file downloaded succesfully....");
				}
				else
				{
					System.out.println("Text file NOT downloaded....");
				}
					
				
				//pdf file
				driver.findElement(By.id("pdfbox")).sendKeys("testing");
				driver.findElement(By.id("createPdf")).click();
				driver.findElement(By.id("pdf-link-to-download")).click();
				
				Thread.sleep(5000);
				
				if(isFileExist("C://Users/admin/Downloads/info.pdf")==true)
				{
					System.out.println("PDF file downloaded succesfully....");
				}
				else
				{
					System.out.println("PDF file NOT downloaded....");
				}
				

			}

			
		public static boolean isFileExist(String path)
			{
			
				File f=new File(path);
				
				if(f.exists())
				{
					return true;
				}
				else
				{
					return false;
				}
				
		

	}

}
