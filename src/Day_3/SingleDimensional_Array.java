package Day_3;

/*
 1) Declaration of an Array
 1) Insert Values int Array
 3) Find size of an Array
 4) Read Values from an Array
 */

public class SingleDimensional_Array {

	public static void main(String[] args) 
	{
/*		int a[] = new int [5];//Declaration of a Static Array
	//Inserting known Values and Size into the Array....
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
*/
//Use Dynamic Array for no Limit Element, can add any number of values....
		int a[]= {50,100,150,200,250,300}; //Declaration + Initialization
		
// To know the length of an Array
		System.out.println(a.length);//5
		
//	System.out.println(a[3]);// (200)Extracting single value with Index number...
		
//Using Classic For Loop to Extract all the Array Values...
/*		for(int i=0;i<6;i++)//Declaration/Initialization + Condition + Increment
				{
					System.out.println(a[i]); //Array + Incrementing Index [50,100,150,200,250,300]...	
				}
*/				
	//Enhanced For Loop (Doesn't require Initialization nor Condition nor Incrementation...
		for(int value:a)  // Enhanced or For each Loop
		{
			System.out.println(value);
		}
	
	}

}
