package corejava;

import java.util.Scanner;

public class First {
	public static void main(String a[])
	{
		System.out.println("Enter the valuer of P  ");
		System.out.println("Enter the value of R  ");
		System.out.println("Enter the value of t  ");
		Scanner sc = new Scanner (System.in);
		int i= sc.nextInt();
		int j= sc.nextInt();
		int k= sc.nextInt();
		int y=(i*j*k)/100;
		System.out.println("simple interset y   "+y);
		
	}
}
