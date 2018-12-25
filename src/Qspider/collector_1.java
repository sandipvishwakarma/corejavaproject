package Qspider;
import java.util.*;
public class collector_1 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("Hii");
		al.add(10);
		al.add("hii");
		al.add(null);
		al.add(true);
		System.out.println(al);//print array lint in array format
		/// print array element one by one
		for(int i = 0; i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}

}
