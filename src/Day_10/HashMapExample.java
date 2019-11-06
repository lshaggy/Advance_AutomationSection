package Day_10;

import java.util.HashMap;
import java.util.Map;

/*
	Declare HashMap
	Add pairs (Combination of key & value) to HashMap
	Remove pairs from HashMap
	Read pairs from HashMap

*/
public class HashMapExample {

	public static void main(String[] args) 
	{
		//Declare HashMap
		HashMap<Integer, String> hm = new HashMap<Integer,String>();

		//Add pairs (Combination of key & value) to HashMap
		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(103, "Mary");
		hm.put(104, "John");
		
		//Print all the Pairs from HashMap...
		System.out.println(hm);//{101=John, 102=Scott, 103=Mary, 104=John}
		
		//How to remove a pair from HashMap
		hm.remove(103);
		System.out.println("After removing a Pair from HashMap list "+hm);
		
		//How to Retrieve a pair from HashMap...
		System.out.println(hm.get(102));// Scott
		
		
		System.out.println();
		//To Read pairs (an Entry set)from HashMap
		for(Map.Entry m:hm.entrySet()) //Using Enhanced forLoop to retrieve the individual values
			{
			System.out.println(m.getKey()+"  "+m.getValue());
			}
		
		
	}


}
