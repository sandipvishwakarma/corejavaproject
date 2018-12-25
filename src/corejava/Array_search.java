package corejava;

import java.util.Scanner;

public class Array_search {
	public static void main(String args[]) {
		
		 int i, j;
		int ar[] = new int [10];
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter the 10 value for Array ");
		 for(i=0;i<10;i++)
		 {
			 ar[i]=sc.nextInt();
			 
		 }
		 System.out.println("Enter a number ");
			j= sc.nextInt();
		 int f=0;
		 for(i=0;i<10;i++)
		 {
			 if (ar[i]==j)
			 {
				 f++;
         	 }
	
		 }
		 
		 if(f>0)
		 {
			 System.out.println("Found");
		 }
 		 else {
			 System.out.println("Number not found");
		 }
	}

}
