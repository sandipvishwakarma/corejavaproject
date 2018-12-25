package Qspider;
class MBA
{

	int year;
	String name;
	MBA()
	{
		System.out.println("hello");
	}
	
	public MBA(String name,int year) {
		super();
		while (year==2018){
			System.out.println("Current year student");
			break;
		}
				
		
	}
}
class Examp
{
	public static void main(String[] args) {
		
		MBA m = new MBA();
	MBA m1 = new MBA("nikita",2018);
	}
}
