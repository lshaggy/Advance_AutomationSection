package Day_6;

public class ConstructorOverloadingMethod {
	
	int x,y;

	
	ConstructorOverloadingMethod()  //first constructor 
	{
		x=100;
		y=200;
		System.out.println(x+y);
	}
	
	ConstructorOverloadingMethod(int a, int b) //Second constructor 
	{
		x=a;
		y=b;
		System.out.println(x+y);
	}

	public static void main(String[] args) 
	{
		//ConstructorOverloadingMethod col= new ConstructorOverloadingMethod(); //First
		
		ConstructorOverloadingMethod col = new ConstructorOverloadingMethod(10,20);//Second

	}

}
