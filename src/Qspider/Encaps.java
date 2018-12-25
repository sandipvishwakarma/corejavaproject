package Qspider;

 class demoEncaps {

		private int a=10;
		private String name ="aba";
		public int getA() {
			return a;
		}
		public void setA(int a) {
			this.a = a;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void m1()
		{
			System.out.println("Public method ");
		}
		
	}
class Encaps
{
	public static void main(String[] args) {
		demoEncaps ds = new demoEncaps();
		ds.setA(50);
		System.out.println(ds.getA());
		System.out.println(ds.getName());
		ds.setName("rony");
		//System.out.println(ds.setName("rony"));
		
		
	}
}