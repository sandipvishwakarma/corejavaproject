package corejava;

import java.util.Scanner;

public class operator_demo {
public static void main(String ahg[])
{
	int a,b,c,result;
	System.out.println("Enter the value of a  ");
	System.out.println("Enter the value of b  ");
	System.out.println("Enter the value of c  ");
	Scanner input = new Scanner (System.in);
	a = input.nextInt();
	b = input.nextInt();
	c = input.nextInt();
	result = (a>b)?((a>c)?a:c):((b>c)?b:c);
	System.out.println(result + "is greatest");
}
}
