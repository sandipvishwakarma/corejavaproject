package corejava;

import java.util.Scanner;

public class array {
	public static void main (String args[]) {
		int i, sum=0;
		System.out.println("Enter the five number for addition");
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[5];
		
		for(i=0; i<5; i++)
		{
			ar[i]=sc.nextInt();
		}
		for(i=0;i<=4;i++) {
			sum= sum+ar[i];
			
			
		
		}
		System.out.print(sum);
				}
	

}
