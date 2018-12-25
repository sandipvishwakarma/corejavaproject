package Qspider;

import java.util.HashMap;
import java.util.Map;

public class charFrequency {

	public static void main (String[] args) {

		frequencyOfChar("i am java lover i am java developer");

	}
	static void frequencyOfChar(String str)
	{
		HashMap<String, Integer>foc = new HashMap<>();
		String [] s = str.split(" ");
		for(String tempstring:s)
		{
			if (foc.get(tempstring)!= null)
			{
				foc.put(tempstring, foc.get(tempstring)+1);
			}
			else
			{
            foc.put(tempstring, 1); 
			}
		}
		System.out.println(foc);
	}
	}


