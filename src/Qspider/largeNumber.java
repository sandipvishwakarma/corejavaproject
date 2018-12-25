package Qspider;

import java.util.Scanner;

public class largeNumber {

	public static void main(String[] args) {
		
		//digit addition
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		
		int rem;
		int sum =0;
		while (a>0)
		{
			rem = a%10;
			sum = sum + rem;
			a = a/10;
						
		}
		System.out.println(sum);
	}

}
