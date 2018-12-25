package Qspider;

import java.util.Scanner;

public class ArrayUserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size =sc.nextInt();
		
		int[] a1 = new int[size];
		System.out.println("Enter the values to store in array");
		
		for(int i =0; i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
			//System.out.println(a1[i]);
		}
		for(int i=0;i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}
		String[] str = {"w","r"};
		System.out.println(str[0]);
		String [] str1 = new String[size];
		str1[0]="ram";
		str1[2]="sai";
		str1[1]="jai";
		for(int i=0; i<str1.length;i++)
		{
			if (str1[i] =="ram")
			{
			System.out.println(str1[i]);
			}
			else 
			{
				System.out.println(str1[i]+"dddd");
			}
		}
		
	}
}
