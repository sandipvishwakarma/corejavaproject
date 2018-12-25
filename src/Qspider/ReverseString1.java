package Qspider;

public class ReverseString1 {
	public static void main(String[] args) {
		String s = "hello i am trying to reverse this string";
		String st =s.toUpperCase();
		char[] chs =s.toCharArray();
		System.out.println(chs);
		System.out.println(st);
		boolean sd = s.isEmpty();
		System.out.println(sd);
		String [] str = s.split(" ");
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.print(str[i]+" ");
		}
	}
 
	
}
