package corejava;

import java.util.Scanner;

public class pyramid_print1 {
	public static void main(String args[])
	{
		int i,j;
		//System.out.println("enter the heigth of pyramind");
		// Scanner sc= new Scanner (System.in);
		// int n=sc.nextInt();
		 for(i=0;i<=5;i++)
		 {
			 for (j=0;j<=i;j++)
			 {
				 System.out.print("*");
			 }
			 System.out.println("");
		 }
		
	}
}
