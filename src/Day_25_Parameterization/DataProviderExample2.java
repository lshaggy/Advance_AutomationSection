package Day_25_Parameterization;

import org.testng.annotations.*;

public class DataProviderExample2 
{
	@Test(dataProvider="testdata")
	  void test(int x, int y, int z)
	  {
		System.out.println(x+y+z);
	  }
	
	 
	 @DataProvider(name="testdata")
	Object [][] data()
	 {
		Object a[][]= { {10,20,30},{100,200,300},{10,15,25}};
		 return a;
	 }

}
