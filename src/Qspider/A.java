package Qspider;

class A {
int a ;
int b;
void m1(int a1, int b1)
{
	a=a1;
	b=b1;
	System.out.println(a1);
	System.out.println(b1);
	
}
public static void main (String args[])
{
	A q = new A();
	q.m1(12,55);
}
}
