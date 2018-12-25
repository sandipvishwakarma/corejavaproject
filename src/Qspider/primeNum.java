package Qspider;

public class primeNum {
	public static void main(String[] args)
	{
		int count=0;
		int num =2;
		for(int i=2;i<=40;i++)
		{
			if (num%i==0)
			{
				count++;
				break;
			}
			
		}
		if (count==0)
		{
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
	}

}
