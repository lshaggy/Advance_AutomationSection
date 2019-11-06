package Day_2;

public class Assign_Day2_Count {

	public static void main(String[] args) 
	{
		int  count = 0;
		int Total = 16534;
		
		while(Total !=0) 
		{
			
			Total = Total/10;
			++count;
		}
		System.out.println("Number of digits is: " + count);

	}

}
