package corejava;

import java.util.Scanner;

public class inter_face {

	public static void main(String args[]) {
		System.out.println("enter the value of i and j");
		Scanner sc = new Scanner (System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		demo D = new demo();
		int f ; double g;
		f = D.f1(i);
		 g= D.f2(j);
	System.out.println(f);
	System.out.println(g);
	}
}

interface demointf{
	int  f1(int i);
	double f2(int j);
	
}
class demo implements demointf{
	
	public int f1(int i) {
		int b;
		b= i*i;
		return b;
	}
public double f2(int j) {
	int k;
	k = j/2;
	return k;
}


}


