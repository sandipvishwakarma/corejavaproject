package corejava;

class Multi implements Runnable
{  
	public void run()
	{  
		
		System.out.println("thread is running..."+Thread.currentThread());  
	}  
  
	public static void main(String args[])
	{  
		Multi m1=new Multi();
		Multi m2=new Multi();
		Multi m3=new Multi();
		Thread t1 =new Thread(m1); 
		t1.setName("t1");
		t1.setPriority(10);
		Thread t2 =new Thread(m2);
		Thread t3 =new Thread(m3);
		t1.start();
		t2.start();
		t3.start();
	}  
}  