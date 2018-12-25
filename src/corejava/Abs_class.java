package corejava;//Abstract class  example

public class Abs_class {
	public static void main(String args[]) {
		
	
	react1 r = new react1();
	circle1 c = new circle1();
	
	//r.cal(10,5);
	//r.showresult();
		area1 ar[]=new area1[2];;
		ar[0]=r;
		ar[1]=c;
		for(int i=0;i<=1;i++)
		{
			ar[i].cal(10, 5);
			ar[i].showresult();
		}
		//ar.ss();
	}

}
abstract class area1{
	double l,b,r;
	abstract double cal(double l,double b);
	void showresult ()
	{
		System.out.println(" "+r);
	}
	
}
class react1 extends area1{

	double cal(double l, double b)
	{
		 
		r= l*b;
		return r;
	} 
}

class circle1 extends area1{

	double cal(double l, double b)
	{
		 
		r= 3.14*l*l;
		return r;
	} 
	
}