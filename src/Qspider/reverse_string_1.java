package Qspider;

public class reverse_string_1 
{
	//WAP for String reverse//I am a java developer -----developer java a am I 
	public static void main(String[] args)
	{
		String s = "I am a java developer";
		String[] str = s.split(" ");
        for(int i =str.length-1;i>=0;i--)
        {
        	System.out.print(str[i]+ " ");
        }
	}

}
