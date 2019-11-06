package Day_9;

/*  case1: Exception occurred, catch block handled ---> finally block will execute
	case2: Exception occurred, catch block NOT handled --> finally block will execute
	case3: Exception does not occurred, catch block ignored ----> finally block will execute
  
*/

public class FinallyBlock {

	public static void main(String[] args)
	
	{
		int a = 100;
		
		try
		{
		System.out.println(a/0);
		}
		catch(NullPointerException e)
		{
			
		System.out.println("Exception is occoured and handled....");
		}
		finally
		{
			System.out.println("Execution Entered into finally Block");
		}
		
		System.out.println("Program is Ended & Exited........");
/*		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
*/
	//	Thread.sleep(5000);
		

		
		

	}

}
