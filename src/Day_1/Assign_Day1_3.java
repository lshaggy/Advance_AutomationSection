package Day_1;

public class Assign_Day1_3 {

	public static void main(String[] args) 
	{
		int a =10;
		int b =15;
		
		System.out.println("Before swapping A value is: "+a);
		System.out.println("Before swapping B value is: "+b);
		int Temp = a;// Third Variable implemented 
			a = b;
			b = Temp;
		System.out.println("After swapping A value is: "+a);
		System.out.println("After swapping B value is: "+b);

	}

}
