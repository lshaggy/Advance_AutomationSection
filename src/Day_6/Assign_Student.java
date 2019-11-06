package Day_6;

public class Assign_Student {
	
	int Sid;
	String Sname;
	int Sub1, Sub2, Sub3;
	
	void getStuData(int id, String name)
	
	{
		Sid=id;
		Sname=name;
		System.out.println(id);
		System.out.println(name);
	}

	
void getStudMarks(int s1, int s2, int s3)
	
    {
    	Sub1=s1;
    	Sub2=s2;
    	Sub3=s3;
    	
    	System.out.println("Sub1: "+s1+ " Sub2: "+s2+" Sub3: "+s3);
    }

void totalMark()

{
	System.out.println("Total Mark is: "+ (Sub1+(Sub2+Sub3)));
	System.out.println("");
	
}
	
	public static void main(String[] args) 
	
	{
	
		Assign_Student Stud1 = new Assign_Student();
		Stud1.getStuData(101, "Smith First Student");
		Stud1.getStudMarks(67, 82, 59);
		Stud1.totalMark();
		
		Assign_Student Stud2 = new Assign_Student();
		Stud2.getStuData(102, "Ralph Second Student");
		Stud2.getStudMarks(77, 71, 66);
		Stud2.totalMark();
		
		Assign_Student Stud3 = new Assign_Student();
		Stud3.getStuData(103, "Bernard Third Student");
		Stud3.getStudMarks(58, 88, 62);
		Stud3.totalMark();
        
		
			
		}

}
