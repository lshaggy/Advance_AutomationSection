package Day_4;

public class StringReverse {

	public static void main(String[] args) 
	{
		String s ="Selenium";
		
		int len =s.length();
		System.out.println(len);//8 characters
		String rev="";
		
		for (int i=len-1;i>=0;i--)//7 6 5 4 3 2 1
		{
			rev =rev+s.charAt(i);//muineleS
		}
		System.out.println(rev);// Reversed String
		
		if(s.equals(rev))
		{
			System.out.println("String is Palidrome");
			
		}
		else
			{
				System.out.println("String is Not Palidrome");
			
				
			}
		
	}

}
