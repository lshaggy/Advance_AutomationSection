package Day_3;

/*
1) Declaration of an Array
1) Insert Values int Array
3) Find size of an Array
4) Read Values from an Array
*/

public class TwoDimasionalArray {

	public static void main(String[] args) 
	{
//Declaration of a Static Array		
/*
		int a[][]= new int[3][2]; //int [][]a=new int[3][2]; int []a[]=new int [3][2];

//Inserting Values in to known size of an Array Element....
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
*/
//Use Dynamic Array for no Limit Element, can add any number of values....
		int a[][] = { {100,200},{300,400},{500,600}  }; //Declaration + Initialization
// To know the length of an Array
		System.out.println(a.length);//3 is Number of Row
		System.out.println(a[0].length);// 2 is the Number of the Column 
		
// Reading values for 2 Dimensional Array using Classic For Loop..
		
/*	
		for(int ir=0;ir<3;ir++)
		{
			for(int j=0;j<=a[0].length-1;j++)
			{
				System.out.print(a[ir][j]+" ");
				
			}
     		System.out.println();
     	}
*/
//Enhanced For Loop (Doesn't require Initialization nor Condition nor Incrementation...
		for(int i[]:a)
		{
			for(int value:i)
			{
				System.out.print(value+"  ");
			}
		System.out.println();


	      }
	}
}
