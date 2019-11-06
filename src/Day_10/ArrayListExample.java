package Day_10;

import java.util.ArrayList;

/*
	How to declare array list
	How to to add elements/values to array list
	Find size of array list
	Remove elements/values from array list
	Insert a new element in the middle of array list
	Read values from arraylist
 */

public class ArrayListExample {

	public static void main(String[] args) 
	{
		//How to declare array list
		ArrayList list = new ArrayList();
		
		//How to to add elements/values to array list
		list.add("welcome");
		list.add(10);
		list.add(100.5);
		list.add(true);
		list.add('A');
		
		
		//Find size of array list
		System.out.println(list.size());
		
		//Print all the values from array list
		System.out.println("Original List items " +list); //[welcome, 10, 100.5, true, A]
		
		//How to Remove elements/values from array list
		
		list.remove(2);
		System.out.println("After value is removed " +list);
		
		//Add new element to the list
		list.add("Selenium");
		System.out.println("After value is added " +list);
		
		//Insert a new element in the middle of array list
		list.add(4,"Java");
		System.out.println("After value is inserted in the middle " +list);
		
		//Read specific values from arraylist
		System.out.println(list.get(4));
		
		//Retrieve all the values from array list
		
		for(Object i:list)  //Using Enhanced forLoop to retrieve the individual values
		{
			System.out.println(i);
		}

	}

}
