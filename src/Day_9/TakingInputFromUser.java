package Day_9;

import java.util.Scanner;

public class TakingInputFromUser {

	public static void main(String[] args) 
	
	{
		Scanner input =new Scanner(System.in);
		
/*	    System.out.println("Enter first number: ");
		int a=input.nextInt(); //Take integer type of data  [ nextDouble()]
		
		System.out.println("Enter Second number: ");
		int b=input.nextInt();
		
		System.out.println(a+b);
		System.out.println("End of program..... ");
*/	
		System.out.println("Enter your name: ");
		String name = input.next(); //  Takes String type of data
		
		System.out.println("Your name is: "+name);
		System.out.println("Program ended......");

	}

}
