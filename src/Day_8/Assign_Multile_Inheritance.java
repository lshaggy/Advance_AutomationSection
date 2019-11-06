package Day_8;

interface A_
{
	int a=20;
	int b=30;
	
	void add();
}

interface B
{
	int x=40;
	int y=50;
	
	void mul();
}


public class Assign_Multile_Inheritance implements A_,B

{
	public void add()
	{
		System.out.println(a+b);
	}
	
	
	public void mul()
	{
		System.out.println(x*y);
	}

	public static void main(String[] args) 
	
	{
		Assign_Multile_Inheritance mi = new Assign_Multile_Inheritance();
		mi.add();
		mi.mul();

	
	}

}
