package Day_7;

class A //Parent Class
{
	int a;
	void display()
	{
		System.out.println(a);
    }
}
	
	class B extends A //B is Child Class of A (Single Inheritance)
	{
	int b;
	void show()
	{
		System.out.println(b);	
	}
}

	class C extends B //C is Child class of B (Multi-level Inheritance)
	{
	int c;
	void print()
	{
		System.out.println(c);	
	}
}


public class InheritanceDemo {

	public static void main(String[] args) 
	{
		A aobj = new A();
		aobj.a=10;
		aobj.display();
		
		B bobj = new B();
		bobj.a= 100;
		bobj.b= 200;
		
		C cobj = new C(); //(cobj) is Object of the class
		cobj.a=5;   // Values are assigned to the variables
		cobj.b=15;
		cobj.c=25;
		
		//calling the methods of class C
		cobj.display();
		cobj.show();
		cobj.print();
		
	}

}
