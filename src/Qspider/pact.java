package Qspider;

import java.util.Scanner;

public class pact {
	
 public static void main(String[] args) {
	 // find duplicate value in a array
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the size of an array");
	 int size = sc.nextInt();
	 
	 int [] ary = new int[size];
	 System.out.println("Enter the array value in a array");
	 for(int i=0; i <ary.length;i++)
	 {
		ary[i] = sc.nextInt();
		
	 }
	 for(int i=0; i <ary.length;i++)
	 {
      System.out.println(ary[i]);		
	 }
	 
	 //find the duplicate value in a array
	 for(int i=0; i <ary.length;i++)
	 {
		 for(int j=i+1; j <ary.length;j++)
		 {
			if (ary[i]==ary[j])
			{
				System.out.println("duplicate value= "+ary[j]);
			}
		 }		
	 }
}
}
