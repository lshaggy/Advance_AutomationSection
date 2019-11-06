package Day_7;

class Bank
{
	double IntrestRate()
	{
		return 0;
	}
}
class XBank extends Bank
{
	double IntrestRate()
	{
		return 10.5;
	}
}

class YBank extends Bank
{
	double IntrestRate()
	{
		return 9.5-1;
	}
}

public class MethodOverriding {

	
	public static void main(String[] args) 
	{
		Bank bobj = new Bank();
		System.out.println(bobj.IntrestRate());
		
		XBank xobj = new XBank();
		System.out.println(xobj.IntrestRate());
		
		YBank yobj = new YBank();
		System.out.println(yobj.IntrestRate());

	}

}
