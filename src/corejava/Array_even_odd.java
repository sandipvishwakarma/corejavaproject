package corejava;

import java.util.Scanner;

public class Array_even_odd {
	
	public static void main(String args[]) {
		
		System.out.println("Enter the 10 value for an arrey");
		int ar[]= new int[10];
		Scanner sc = new Scanner(System.in);
		int i,j =0, k=0 ;
		
		for(i=0;i<10;i++)
		{
			
			ar[i]= sc.nextInt();
			
			if (i%2==0)
			{
				
				j= j+1;
			}
			else 
			{
				k++;
			}
		}
		

		for(i=0;i<10;i++)
		{
			
			 System.out.println(ar[i]);
		}
		System.out.println("even number" +j);
		System.out.println("odd number" +k);
	
				}

}
