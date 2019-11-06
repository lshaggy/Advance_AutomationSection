package Day_8;

public class Animal 

{
	String color="White";
	
	void eating()
	{
		System.out.println("Eating.....");
	}

}

class Dog extends Animal
{
	String color="Black";
	
	void eating()
	{
		System.out.println("Eating Bread.....");
		super.eating();
	}
	
	void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}
