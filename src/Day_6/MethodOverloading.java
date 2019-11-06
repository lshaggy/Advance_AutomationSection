package Day_6;

public class MethodOverloading {
	
	int x,y;
	double z;
	
	int addition()
	{
		x=100;
		y=200;
		
		return (x+y);
	}
	
	int addition(int a, int b)
	{
		x=a;
		y=b;
		
		return (x+y);
	}
	
	double addition(int a, double b)
	{
		x=a;
		z=b;
		
		return (x+z);
	}

	double addition(int a,int b, double c)
	{
		x=a;
		y=b;
		z=c;
		
		return (x+y+z);
	}
	
	void main()
	{
		System.out.println("This is user defined main method");
	}
	
	public static void main(String[] args) 
	
	{
		MethodOverloading mol = new MethodOverloading();
		System.out.println(mol.addition(100, 200));
		System.out.println(mol.addition(100, 200,100.5));
		System.out.println(mol.addition());
		
		mol.main();
	}

}
