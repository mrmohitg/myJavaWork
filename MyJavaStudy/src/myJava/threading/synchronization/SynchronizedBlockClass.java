package myJava.threading.synchronization;
class Test
{
	void display(int i)
	{
		System.out.println("This is the example of Synchronized Block");
		synchronized(this)
		{
			try
			{
			for(;i<=10;i++)
			{
				System.out.println(i);
				Thread.sleep(5000);
			}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println("Synchronized Block is ending");
	}
}
class Thread11 extends Thread
{
	Test t;
	Thread11(Test t)
	{
		this.t=t;
	}
	public void run()
	{
		t.display(1);
	}
}
class Thread22 extends Thread
{
	Test t;
	Thread22(Test t)
	{
		this.t=t;
	}
	public void run()
	{
		t.display(1);
	}
}
public class SynchronizedBlockClass 
{
	public static void main(String args[])
	{
		Test obj = new Test();
		Thread11	obj1 = new Thread11(obj);
		obj1.start();
		Thread22 obj2 = new Thread22(obj);
		obj2.start();
	}

}
