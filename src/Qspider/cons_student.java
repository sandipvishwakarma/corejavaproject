package Qspider;

class cons_student {
	int roll_no;
	String name; 
	String dept;
	cons_student()
	{
		
	}
	cons_student(int roll_no1, String name1,String dept1)
	{
		roll_no=roll_no1;
		name=name1;
		dept=dept1;
		
	}
	void disp()
	{
		System.out.println("Roll no ="+roll_no);
		System.out.println("Name ="+name);
		System.out.println("dept ="+dept);
		
	}
	void disp(int q)
	{
		System.out.println("Roll ="+roll_no);
		System.out.println("N ="+name);
		System.out.println("d ="+dept);
		
	}

	public static void main(String[] args) {
		cons_student s = new cons_student();
		s.disp();
		cons_student s1 = new cons_student(1,"ram","EE");
		s1.disp();
		cons_student s2= new cons_student(5,"rrrr","ec");
		s2.disp(3);

	}

}
