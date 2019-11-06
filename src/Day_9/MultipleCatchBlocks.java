package Day_9;

public class MultipleCatchBlocks {

	public static void main(String[] args) 
	{
				System.out.println("Program is started........");
				
		//		int num= 100;
				String s= "Welcome";
				
				try
				{
		//		System.out.println(num/0); //ArithmeticException (dividing any number by zero..
				int num=Integer.parseInt(s);
				}
				catch(ArithmeticException e)
				{
					System.out.println("ArithmeticException Exception handled ");
					System.out.println(e.getMessage());
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println(e.getMessage());
					System.out.println("ArrayIndexOutOfBoundsException Exception Handled.....");
				}
			
				catch(NumberFormatException e)
				{
					System.out.println(e.getMessage());
					System.out.println("NullPointerException Exception Handled......");
				}
			
		
			
		  
		/*      String s= null;
				try
				{
				System.out.println(s.length());//NullPointerException
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
					System.out.println("NullPointerException Exception Handled......");
				}
				
		*/
		 
				
		/*
				int a[]= new int[5];
				  
				try
				
				{
				a[10]=100; //ArrayIndexOutOfBoundsException
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println(e.getMessage());
					System.out.println("ArrayIndexOutOfBoundsException Exception Handled.....");
				}
		*/

//				String s= "Welcome";
//				int num=Integer.parseInt(s); //NumberFormatException (Integer.parseInt()-->converting strings to int) error 
							
						
				
				System.out.println("Program is Ended.........");
				


	}

}
