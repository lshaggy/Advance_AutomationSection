package Day_4;

public class Assign_Strings {

	public static void main(String[] args) 
	{
		String s = "Advanced";
		String s1 = "advanced";
		String s2 = " AutoMation";
		
		System.out.println(s.equals(s1)); //false
		System.out.println(s.equalsIgnoreCase(s1));//true
		
		System.out.println(s.concat(s2));//Advanced AutoMation
		System.out.println(s.length());//8
		System.out.println(s2.substring(0, 5));// Auto
		System.out.println(s.toLowerCase());//advanced
		System.out.println(s.toUpperCase());//ADVANCED
				
		
//Swapping of 2 Strings....
		s1="abc";
		s2="xyz";
		
		System.out.println("Before Swap S1: "+s1);
		System.out.println("Before Swap S2: "+s2);
		
		String s3="";
		
		
		s3=s1;
		s1=s2;
		s2=s3;
		System.out.println("After Swap S1: " +s1);
		System.out.println("After Swap S2: " + s2);
		
//Reversed Strings...
		System.out.print(s.charAt(7));//d
		System.out.print(s.charAt(6));//e
		System.out.print(s.charAt(5));//c
		System.out.print(s.charAt(4));//n
		System.out.print(s.charAt(3));//a
		System.out.print(s.charAt(2));//v
		System.out.print(s.charAt(1));//d
		System.out.print(s.charAt(0));//A
		System.out.println();

	}

}
