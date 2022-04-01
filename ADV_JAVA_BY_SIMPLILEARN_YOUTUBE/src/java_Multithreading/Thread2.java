package java_Multithreading;

public class Thread2 implements Runnable{
	
	@Override
	public void run()
	{
		try
		{
			System.out.println("Thread 2 is Running.");
		}
		catch(Exception e)
		{
			System.out.println("Exception is caught ");
		}
	}

}
