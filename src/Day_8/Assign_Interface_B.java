package Day_8;

interface A
{
	int a = 15,b = 25;
	
	void sum(); //By default here Access Modifier is "Public"

}

public class Assign_Interface_B implements A

{
	public void sum() // By default here Access Modifier "Default"
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) 
	{
		Assign_Interface_B ib = new Assign_Interface_B();
		ib.sum();
		
	}

}
