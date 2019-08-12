package myJava.threading.synchronization;

class Demo
{
	void display(int x)
	{
		System.out.println("This is example of Synchronized Block");
		synchronized(this)
		{
			for(;x<10;x++)
			{
				try
				{
					Thread.sleep(1000);
					System.out.println(x);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		System.out.println("Synchronized Block Exited");
	}
}
public class SynchronizedBlockClass2 
{
	public static void main(String[] args) 
	{
		final Demo d = new Demo();
		Thread t1 = new Thread()
		{
			public void run()
			{
				d.display(0);
			}
		};
		Thread t2 = new Thread()
		{
			public void run()
			{
				d.display(0);
			}
		};
		t1.start();
		t2.start();
	}

}
