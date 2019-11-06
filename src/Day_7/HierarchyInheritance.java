package Day_7;

class Parent
{
	int x;
	void display()
	{
      System.out.println(x);
	}
}

class Child1 extends Parent
{
	int y;
	void show()
	{
		System.out.println(y);
	}
}
class Child2 extends Parent
{
	int z;
	void print()
	{
		System.out.println(z);
	}
}

public class HierarchyInheritance {

	public static void main(String[] args) 
	{
		Child1 c1 = new Child1();
		c1.x=100;
		c1.y=200;
		c1.display();
		c1.show();
		
		Child2 c2 = new Child2();
		c2.x=10;
		c2.z=20;
		c2.display();
		c2.print();

	}

}
