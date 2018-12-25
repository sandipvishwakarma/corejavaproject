package Qspider;

import java.util.HashSet;

public class SumPrimeNumber {

	public static void main(String[] args) {
     
		int count=0;
	HashSet<Integer> hst =new HashSet<Integer> ();	
		for (int i=1;i<=100;i++)
		{
			for(int j = 1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
		
				if (count==2)
				{
					hst.add(i);
					System.out.println(hst);
					System.out.println("hell");
				}
				else 
				{
					System.out.println("Number is not prime");
				}
			}
		
	}

}
