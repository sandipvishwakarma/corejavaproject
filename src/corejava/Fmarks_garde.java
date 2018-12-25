  package corejava;

import java.util.Scanner;

public class Fmarks_garde 
{
	public static void main(String args[])
		{

         System.out.println("Enter the number of student");
         Scanner sc = new Scanner (System.in);
         int number = sc.nextInt();
         int i;
         for(i=1;i<=number;i++)
         	{

            System.out.println("enter the roll no. and marks");
            int r=sc.nextInt();
            int m= sc.nextInt();
            student s1=new student();
            s1.setdata(r,m);
            s1.printgarde();

         	}

		}
}
class student
{
int roll;
int marks;
	void setdata(int r, int m)
	{
		roll=r;
		marks=m;
	}
void printgarde()
{
	if (marks>75)
		{
		System.out.println("A");
		}
	else
	{
		if(marks>50)
			{
				System.out.println("B");
			}
		else
		{
			System.out.println("Fail");
		}

	}

}
}