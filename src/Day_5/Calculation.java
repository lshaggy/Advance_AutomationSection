package Day_5;

public class Calculation {
	
	int x=100, y= 200;
	
//Case 1- not taking any parameter, not returning any value	
/*
	void sum()
	{
		System.out.println(x+y);
	}
*/
//Case 2- not taking any parameter, Returns Result		

/*	int sum()
	{
		return (x+y);
	}
*/
//Case 3- Accepting parameter / arguments, Not returning any  results
	
/*	
	void sum(int a, int b)
	{
		x=a;
		y=b;
		System.out.println((x+y));
	}
*/
	
//Case 4- Accepting parameter / arguments, returns  results
		int sum(int a, int b)
		{
			x=a;
			y=b;
			return((x+y));
		}
	public static void main(String[] args)
	{
		Calculation cal = new Calculation();
//		int rest=cal.sum();
//		System.out.println(cal.sum());
//		cal.sum(10, 20);
		
//      int res=cal.sum(50, 75);
		System.out.println(cal.sum(50, 75));
	}

}
