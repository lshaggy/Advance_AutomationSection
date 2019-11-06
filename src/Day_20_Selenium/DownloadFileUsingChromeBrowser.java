package Day_20_Selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class DownloadFileUsingChromeBrowser {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C://Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize();//Maximize WebPage..
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//Download Text file	
		driver.findElement(By.id("textbox")).sendKeys("testing");//text box
		driver.findElement(By.id("createText")).click();//Generate File
		driver.findElement(By.id("link-to-download")).click();//download Link

		Thread.sleep(5000);
//Verify Text file exist or not..
		if(isFileExist("Usersâ�©/Lshaggyâ�©/Documentsâ�©/info.txt")==true)
		{
			System.out.println("Text File is dowloaded.......");
		}
		else
		{
			System.out.println("Text File is Not dowloaded....");
		}
		

//Download PDF file	
		driver.findElement(By.id("pdfbox")).sendKeys("testing");//text box
		driver.findElement(By.id("createPdf")).click();//Generate File
		driver.findElement(By.id("pdf-link-to-download")).click();//download Link
	    
		Thread.sleep(5000);
//Verify PDF file exist or not..
				if(isFileExist(".pdf")==true)
				{
					System.out.println("PDF File is dowloaded....");
				}
				else
				{
					System.out.println("PDF File is Not dowloaded....");
				}
				
	}

	
	public static boolean isFileExist(String path)
	{
		File f= new File(path);
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
