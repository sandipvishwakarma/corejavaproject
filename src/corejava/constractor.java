package corejava;

public class constractor {
	public static void main (String args[]) {
		//B b= new B();
		B b1 =new B(10);
		//System.out.println(" "+b);
		//System.out.println(" "+b1);
		
	}

}
class A{
	A()
	{
		System.out.println("A Default");
		}
	A(int i){
		System.out.println("A with argument");
		
	}
}
class B extends A{
	B(){
		super(7);
		System.out.println("B default");
	}
B(int i){
	this();
	System.out.println("B with argument");
	
}
}

