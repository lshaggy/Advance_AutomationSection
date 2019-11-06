package Day_8;

interface A1
{
	int x=10; // By default, variables are static and final
	
	void m1(); // Abstract method - has only definition but have no body..
	
}

public class Test_Interface implements A1
{
	public void m1() // Implementation of an interface is done in class..
	{
		System.out.println("This is m1() method......");
		System.out.println("The value of X is: " + x);
	}

	public static void main(String[] args) 
	
	{
		Test_Interface ti = new Test_Interface();
		ti.m1();

	}

}
