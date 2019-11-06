package Day_2;

public class Assign_Day2_Palidrome {

	public static void main(String[] args) 
	{
		int number = 121;
		int rev =0;
		
		while(number!=0)
		{
			rev=rev*10;
			rev=rev+number%10;
			number=number/10;
		}
		System.out.println(rev+" is a Palidrome number");

	}

}
