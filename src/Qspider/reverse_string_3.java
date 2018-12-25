package Qspider;

public class reverse_string_3 {
	// find the length of a string without using length () method
	public static void  main(String [] args)
	{
		String s = "i am a java developer";
		int len = 0;
		char[] ch = s.toCharArray();
		for(char c :ch)
		{
			len++;
			
		}
		System.out.println("length =" +len);
		System.out.println(s.length());
	}

}
