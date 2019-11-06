package Day_22_DatadrivingTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//File--> Workbook -->Sheets-->Rows-->Cell
/*
 XSSFWorkbook 
 XSSFSheet
 XSSFRow
 XSSFCell 
 
 */
public class ReadingExcel {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file =new FileInputStream("C://SeleniumPractice/sikulifiles" );
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
	}

}
