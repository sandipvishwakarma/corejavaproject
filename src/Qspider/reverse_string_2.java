package Qspider;

public class reverse_string_2 {

	public static void main(String[] args)
	{

		 String s = "i am a java developer";
		 String [] str = s.split(" ");
		 for(int i =0; i<=str.length-1;i++)
		 {
			 String rev = str[i];
			// System.out.print(rev+" ");
			 for(int j=rev.length()-1;j>=0; j--)
			 {
				System.out.print(rev.charAt(j)); 
			 }
			 System.out.print(" ");
		 }
	}

}
