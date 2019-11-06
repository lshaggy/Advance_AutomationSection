package Day_6;

public class StaticExample {

	static int a=10;//static variable
	int b=20;// non static variable.
	
	static void m1()//Static method
	{
		System.out.println("This m1() Static method");
	}
	
	void m2()//Non static
	{
		System.out.println("This m2() Non Static method");
	}
	
	void m3()//Non static
	{
		System.out.println("-------------------");
		System.out.println(a); //static variable
		System.out.println(b); //Non static variable
		m1();
		m2();
	}
	

	public static void main(String[] args) 
	{
//1.Static method can access only static stuff directly (Without Object of a class)
	    System.out.println(StaticExample.a);
	  // System.out.println(b); //incorrect -b is Non static variable
	    
	    
	    StaticExample.m1(); //m1();
	  // m2(); //incorrect -m2 is Non static method
	    
//1.Static method can also access static stuff directly (through Object of a class)
	    
	    StaticExample se = new StaticExample();
	    System.out.println(se.b);
	    se.m2();
	    
	    se.m3();
	
		

	}

}
