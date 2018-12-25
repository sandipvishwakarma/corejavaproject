package Qspider;

public class p_1 {
	public static void main (String[] args )
	{
		for(int i=1; i<=100;i++)
		{
			if (i%5==0 && i%3==0)
			{
				System.out.println("foobar"+i);
			}
			else
			
				if(i%3==0)
				{
					System.out.println("foo"+i);
				}
				else
					if (i%5==0)
				{
						System.out.println("bar"+i);
				}
					else
					{
						System.out.println(i);
					}
		}
	}
}


