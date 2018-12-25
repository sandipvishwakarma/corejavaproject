package corejava;

import java.util.Scanner;

public class Array_sorting 
{
		public static void main(String args[])
		{
			int i,j;
			System.out.println("Enter 10 value for array");
			int ar[] = new int[10];
			Scanner sc = new Scanner(System.in);
			
			for(i=0; i<10;i++)
			{
				ar[i] = sc.nextInt();
			
			}
			
			for(i=0; i<10;i++)
			{
					
		
		   System.out.println(ar[i]);
			}
			for(i=0;i<10;i++)
			{
				for(j=0;j<9-i;j++)
				{
				if (ar[j]>ar[j+1])
				{
					int temp=0;
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
					
					
				}
				}
				
			}
			System.out.println("sorted array ");
			for(i=0; i<10;i++)
			{
				
				 System.out.println(ar[i]);
			}
			
		
		}

}
