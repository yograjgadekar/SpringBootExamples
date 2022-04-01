package java_Synchronization;

public class MathUtils {
 void getMultiples(int n)
	{
		// synchronized keyword is used for getting output one thread after one thread.
		synchronized(this){         
			for(int i = 1; i <=  5; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(400);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			
		}
		
	}

}
