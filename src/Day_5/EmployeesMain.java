package Day_5;

public class EmployeesMain {
	
	public static void main(String[] args)
	{
		
//Creating Object of Employees Class...
		Employees emp1 = new Employees();
		emp1.eid = 101;
		emp1.ename = "John";
		emp1.deptno = 10;
		emp1.job = "Manager";
		emp1.display();
		
		
		Employees emp2 = new Employees();
		emp2.eid = 102;
		emp2.ename = "Peter";
		emp2.deptno = 15;
		emp2.job = "Director";
		emp2.display();
		
	}

}
