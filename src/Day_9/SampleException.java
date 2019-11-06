package Day_9;

import java.util.Scanner;

public class SampleException {

	public static void main(String[] args) 
	{
System.out.println("Program is started.......");
		
		Scanner input = new Scanner(System.in);
		
	    System.out.println("Enter first number: ");
		int a=input.nextInt(); //Take integer type of data  [ nextDouble()]
		
		System.out.println("Enter Second number: ");
		int b=input.nextInt();
		
		System.out.println(a/b); //100/0  is invalid --> ArithmeticException
		System.out.println("End of program..... ");
	
		

	}

}
