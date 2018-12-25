package corejava;

import java.util.Scanner;

public class Even_odd {

	public static void main(String args[])
	{
		int i;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		 i = sc.nextInt();
		 if(i%2==0)
		 {
			 System.out.println("Even");
		 }
		 else
		 {
			 System.out.println("Odd");
		 }
	}
}
