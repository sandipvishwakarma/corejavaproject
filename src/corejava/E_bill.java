 package corejava;

import java.util.Scanner;

public class E_bill {
	public static void main(String args[])
	{
		System.out.println("Enter your unit");
		Scanner sc = new Scanner (System.in);
		int u = sc.nextInt();
		    		
		int b = unitcal(u);
		int tb =tax( b);
		System.out.println("Your total bill is " +(b+tb));
		
		
	}
static	int unitcal (int u)
	{
		if (u<200)
		{
			int x;
			x=u*4;
			return x;
		}

		else {
			
			if (u<400)
			{
				
			int x;
			x=u*5;
			return x;
			}
			
			else {
			int x;
			x=u*6;
			return x;
		}
		}
		
	}

static	int tax (int b)
	{
		
		int t;
		if(b<2000)
		{
			t=(b*10)/100;
		}

		else {
			if (b<5000)
			{
				t=(b*12)/100;

			}
			else {
				t=(b*15)/100;
			}
		}
	
	return t;
	

	
	
	}
	
	
	
}
