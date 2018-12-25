package Qspider;

import java.util.Scanner;

class invalidAge extends Exception
{
	invalidAge(String s)
	{
		super(s);
	}
}

public class Exception_01 {
	

	public static void main(String[] args) throws invalidAge {
		
		System.out.println("Enter user age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		vote( age );
		
	}
	static void vote(int age) throws invalidAge
	{
		if(age<18||age>51)
		{
			throw new invalidAge("You are not eligible for voting ");
		}
	    else 
	     {
		System.out.println("Voting is our right");
	}
	
}
}