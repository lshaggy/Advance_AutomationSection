package Day_6;

public class UseOf_ThisKeyword {

	
	int a,b; //class variables/instance variables /global variables
	
	void getValues(int a, int b)  // method variable/ external variable
	{
		this.a=a;
		this.b=b;
	}
	void add()
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) 
	
	{
		UseOf_ThisKeyword th = new UseOf_ThisKeyword();
		th.getValues(10, 20);
		th.add();

	}

}
