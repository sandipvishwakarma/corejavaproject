package corejava;
public class ProducerConsumerTest 
{
	   public static void main(String[] args)
	   {
	      CubbyHole c = new CubbyHole();
	      Producer p1 = new Producer(c, 1);
	      Consumer c1 = new Consumer(c, 1);
	      p1.start(); 
	      c1.start();
	   }
}
	class CubbyHole 
	{
	   private int contents;
	   private boolean available = false;
	   
	   public synchronized int get()
	   {
	      if (available == false)
	      {
	         try
	         {
	        	  System.out.println("waiting In Get");
	            wait();
	          
	         } 
	         catch (InterruptedException e) 
	         {
	        	 System.out.println(e+"28");
	         }
	      }
	      available = false;
	      notifyAll();
	      return contents;
	   }
	   public synchronized void put(int value) 
	   {
	      if (available == true)
	      {
	         try
	         {
	        	 System.out.println("waiting In put");
	            wait();
	         }
	         catch (InterruptedException e) { System.out.println(e+"43"); } 
	      }
	      contents = value;
	      available = true;
	      notifyAll();
	   }
	}
	class Consumer extends Thread 
	{
	   private CubbyHole cubbyhole;
	   private int number;
	   
	   public Consumer(CubbyHole c, int number)
	   {
	      cubbyhole = c;
	      this.number = number;
	   }
	   public void run()
	   {
	   
		   int value = 0;
	      for (int i = 0; i < 10; i++) 
	      {
	         value = cubbyhole.get();
	         System.out.println("Consumer #" + this.number + " got: " + value);
	      }
	   }
	}
	class Producer extends Thread
	{
	   private CubbyHole cubbyhole;
	   private int number;
	   public Producer(CubbyHole c, int number) 
	   {
	      cubbyhole = c;
	      this.number = number;
	   } 
	   public void run()
	   {
	      for (int i = 0; i < 10; i++)
	      {
	         cubbyhole.put(i);
	         System.out.println("Producer #" + this.number + " put: " + i);
	         try 
	         {
	            sleep((int)(Math.random() * 1000));
	         } 
	         catch (InterruptedException e) { }
	      } 
	   }
	} 