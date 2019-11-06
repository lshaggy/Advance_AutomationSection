package Day_4;

public class StringMethods_Demo {

	public static void main(String[] args) 
	{
      String s= "Welcome";
      
//Find out the length of a String...
      System.out.println(s.length());//7
      
// Concatenation Method
      
      String s1 = "Welcome To ";
      String s2 = "Selenium";
      String s3 = " Automation";
      
      System.out.println(s1.concat(s2));
      System.out.println(s1+s2);
      System.out.println("Welcome To "+s2);
      System.out.println(s1.concat("Selenium"));
      System.out.println(s1.concat(s2).concat(s3));
      System.out.println(s1+(s2).concat(s3)); //Welcome To Selenium Automation
      
      s= "   welcome   ";
      System.out.println(s.length());//String length [13]
      System.out.println(s.trim().length());// Trim the spaces [7]
      
//CharAt() method - Returns a value based on Index number..
      s = "Welcome";
      System.out.println(s.charAt(5));//m
      
//Contains() method -It's a conditional method which returns only boolean value
      System.out.println(s.contains("Come"));//False
      System.out.println(s.contains("come"));//True
    //  System.out.println(("Come".equalsIgnoreCase("come")));//True
      s=s.toLowerCase();  //Convert to LowerCases
      s1= "Come".toLowerCase(); //Convert to LowerCases
      System.out.println(s.contains(s1));  //True
      
//equals() method...
      s1="selenium";
      s2="Selenium";
      
      System.out.println(s1.equals(s2)); //false
      System.out.println(s1.equalsIgnoreCase(s2)); //True
      
// replace() -method : 
      s="welcome to java selenium jave programming";
      System.out.println(s.replace('a','X'));// replace of Single character (welcome to jXvX selenium jXve progrXmming)
      System.out.println(s.replace("java", "python"));//replace of Sequence of Character (welcome to python selenium jave programming)
      
//substring() - method : Returns some portion of the string based on Starting and Ending Index...
      s="WELCOME";
      System.out.println(s.substring(0, 3));
      System.out.println(s.substring(4, 7));
      System.out.println(s.substring(2, 5));
      
//toLowerCase() and toUpperCase() conversion  method
      s="WELcome";
      System.out.println(s.toLowerCase());//welcome
      System.out.println(s.toUpperCase());//WELCOME
      
      
    }
}