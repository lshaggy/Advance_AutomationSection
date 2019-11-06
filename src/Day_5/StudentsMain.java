package Day_5;

public class StudentsMain {

	public static void main(String[] args) 
	
	{
//Approach1: assign values into variables using an object.instance variable		
/*		Students stud1 = new Students();
		stud1.sid =100;
		stud1.sname = "Smith";
		stud1.grade ='A';
		
*/
		
//Approach2: assign values into variables using an object.instance variable
/*	Students stud1 = new Students();
		stud1.getValues(101, "Paul", 'B');
		stud1.display();
*/
		
//Approach3: Constructor invokes at object creation
		
		Students stud1 = new Students(102,"Andrew",'C');
		stud1.display();
	
	}

}
