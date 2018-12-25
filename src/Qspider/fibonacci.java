package Qspider;

public class fibonacci {
 public static void main(String[] args )
 {
	 int prev=0;
	 int next =1;
	 System.out.println(prev);
	 System.out.println(next);
	 int sum =0;
	 for(int i=0; i<=8;i++)
	 {
		 sum=prev+next;
		 System.out.println(sum);
		 prev=next;
		 next=sum;
	 }
	 
	 
 }
}
