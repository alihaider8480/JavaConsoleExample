package pack;

class Thread1 implements Runnable 
{
	@Override
	public void run() 
	{
		for(int i =0;i<=3;i++)
		{
			System.out.println("Thread 1 :"+i);
		}
    }
}

class Thread2 implements Runnable 
{
	@Override
	public void run() 
	{
		for(int i =0;i<=3;i++)
		{
			System.out.println("Thread 2 :"+i);
		}
    }
}

class Thread3 extends Thread 
{
	@Override
	public void run() 
	{
		for(int i =0;i<=3;i++)
		{
			System.out.println("Thread 3 :"+i);
			try 
			{
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
    }
}

class Thread4 extends Thread 
{
	@Override
	public void run() 
	{
		for(int i =0;i<=3;i++)
		{
			System.out.println("Thread 4 :"+i);
		}
    }
}

public class ThreadTest extends Thread
{
	public static void main(String[] args) 
	{
		 Thread1 t1 = new Thread1();
	     Thread2 t2 = new Thread2();
	     Thread th1 = new Thread(t1);
	     Thread th2 = new Thread(t2);
	     Thread3 t3 = new Thread3();
	     Thread4 t4 = new Thread4();
	        
	     try 
	     {
	    	th1.start();              
			th1.join();                // when i wrote this line so thread run this  and whentill they will not end.
		 }
	     catch (InterruptedException e) 
	     {e.printStackTrace();}
	     
	     th2.start();   
	     t3.start();
	     t4.start();   
	}
}