package corejava;

import java.util.Scanner;

public class multiple_class {
	public static void main(String args[])
	{
	  System.out.println("Enter the roll number of student");
	  Scanner sc = new Scanner (System.in);
	  int roll_no = sc.nextInt();
	  //principal p = new principal();
	  char G= principal.provide_grade(roll_no);
	  System.out.println(G);
		
	}

}

class principal
	{
	static char provide_grade(int roll_no)
	{
		clark c = new clark();
		char sg=c.cal_grade(roll_no);
		return sg;
	}
	}
class clark
	{
	char cal_grade(int roll_no)
	{
     teacher t = new teacher();
     int m = t.provide_marks(roll_no);
     if (m>75)
     {
    	 return ('A');
    }
     else
     {
    	 if (m>50)
    	 {
    		return'B';
    	 }
    	 else
    	 {
    		 return 'F';
    	 }
    	 
     }
	}
	}

class teacher 
	{
	int marks[] = {55,66,88,99,100,20};
	int provide_marks(int roll_no)
	{
		return marks[roll_no-1];
	}


}