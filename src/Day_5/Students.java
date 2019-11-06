package Day_5;

public class Students {


		int sid;
		String sname;
		char grade;
		
		Students(int id, String name, char g)//Constructor with Parameters 
		{
			sid=id;
			sname=name;
			grade=g;
		}
		
		void getValues(int id, String name, char g) //Method
		{
			sid=id;
			sname=name;
			grade=g;
			
		}
		
		void display() // Method
		{
			System.out.println(sid);
			System.out.println(sname);
			System.out.println(grade);
	    }

}
