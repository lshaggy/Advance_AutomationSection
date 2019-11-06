package Day_2;

public class Assign_Day2_Reverse {

	public static void main(String[] args) 
	{
		int rev = 0;
		int number =12345;
		
		System.out.println("Number before reverse is: "+number);
		while(number!=0)
		{
			rev=rev*10;
			rev= rev+number%10;
			number = number/10;
		}
		System.out.println("Number after reverse is: "+rev);
	

		
	}

}
