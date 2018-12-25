package Qspider;

import java.util.HashMap;


public class no_Of_char_In_A_String {

	public static void main(String[] args) {
		
		charInString("hello i am hello");

		
	}
	static void charInString(String str)
	{
		HashMap<Character, Integer>mp = new HashMap<Character, Integer>();
		char [] ch = str.toCharArray();
		for (char tempch:ch)
		{
			if (mp.get(tempch)!= null)
			{
				mp.put(tempch, mp.get(tempch)+1);
			}
			else
			{
           mp.put(tempch, 1);  
			}
		}
		System.out.println(mp);
	}

}
