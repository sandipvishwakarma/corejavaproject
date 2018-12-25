package corejava;

import java.util.Scanner;

public class inheritance {
      public static void main(String args[])
      {
    	 System.out.println("Enter the value of redius or length and width ");
    	 Scanner sc = new Scanner(System.in);
    	 int i = sc.nextInt();
    	 int j = sc.nextInt();
    	 circle c = new circle();
    	 double R= c.area1(i, j);
    	 react r = new react();
    	 double RR= r.area1(i, j);
    	 System.out.println("area of cirele" +R);
    	 System.out.println("Area of react" +RR);
    	 
    	 
      }
}

class area{
	
	double area1 (int i, int j)
	{
		return 0.0;
	}
}
class circle extends area  
{
	double area1 (int i, int j)
	{
		double a =3.14 *(i*i);
		return a;
	}
}
class react extends area{
	double area1 (int i,int j) {
		double a =i*j;
		return a;
	}
}