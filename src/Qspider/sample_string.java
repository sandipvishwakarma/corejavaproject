package Qspider;

public class sample_string {

	public static void main(String[] args) 
	{
       String s = new String ("         hello irjnhn j jd oiasfjn");
       String s1 = "Hello";
       String s2 = new String (s1);
       char[] ch = {'s','e','t','d','w','v','h'};
       String s3 = new String (ch);
     //  System.out.print(s3.charAt(5));
      System.out.println(s2.charAt(0));
       System.out.println(s.equalsIgnoreCase(s1));
       System.out.println(s3.length());
     System.out.println(s3.toCharArray());
    System.out.println(s1.isEmpty());
    System.out.println(s.toUpperCase());
    System.out.println(s.toLowerCase());
    System.out.println(s.startsWith("ddhello"));
    System.out.println(s.trim());
    System.out.println(s.replace("ssssss", "arg1"));
  //  System.out.println(s.split("j", "6"));
    
	}

}
