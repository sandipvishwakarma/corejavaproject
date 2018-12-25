package Qspider;

public class sampleString0709 {
	public static void main(String args[])
	{
		String s = "Samantha";
		String s1 = "samantha";
		String s2 = "Samantha";
		//System.out.println(s.equals(s1));
		//System.out.println(s.equals(s2));
		//System.out.println(s==s1);
		/*System.out.println(s==s2);
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.charAt(5));
		System.out.println(s.indexOf("a"));*/
		//System.out.println(s.length());
		String s3 = "";
		System.out.println(s3.length());
		System.out.println(s3.isEmpty());
		System.out.println(s.isEmpty());
		System.out.println(s.toUpperCase());
		System.out.println(s3.toUpperCase());
		String s5 = "java is not easy";
		System.out.println(s5.startsWith("java"));
		System.out.println(s5.endsWith("sy"));
    String s6 = "     i love    india          ";
    System.out.println(s6.length());
    System.out.println(s6.trim());
    s6 = s6.replace("love","we");
    System.out.println(s6);
    
	} 

}
