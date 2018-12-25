package Qspider;

import java.util.Scanner;

public class RunTimePoly {
	public static void main(String[] args) {
		System.out.println("Enter the value of A & B");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		demo d = new demo();
		d.add();
		d.add(a);
		d.add(a, b);
		
		
		
	}

}
class demo
{
	protected void add()
	{
		int a=10;
		int b=20;
		int c= a+b;
		System.out.println(c);
	}
	void add(int a)
	{
		int b= 20;
		int c= a+b;
		System.out.println(c);
	}
	void add(int a,int b)
	{
		int c= a-b;
		System.out.println(c);
	}
}
