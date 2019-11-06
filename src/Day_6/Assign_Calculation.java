package Day_6;

public class Assign_Calculation {

	
	int a, b, c;
	
	void Assign_Calculation(int x, int y, int z)
	{
		a=x;
		b=y;
		c=z;
		
	}
	
	void sum()
	{
		System.out.println(a+(b+c));
	}
	
	public static void main(String[] args) 
	
	{
		Assign_Calculation cal = new Assign_Calculation();
		cal.Assign_Calculation(15, 25, 35);
		cal.sum();

	}

}
