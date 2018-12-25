package Qspider;

import java.util.Scanner;

public class AgeException  {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try
		{
		System.out.println("Enter the two value ");
		int a = sc.nextInt();
		int b =sc.nextInt();
		int res=a/b;
		System.out.println(res);
	}
		catch(Exception e)
		{
			System.out.println("you can not do that");
		}
	}

}