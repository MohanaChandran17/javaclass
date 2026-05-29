package package_1;
class SleepExample
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread Running "+i);
			try
			{
				Thread.sleep(1000);//pause for i secound
			}
			catch(InterruptedException e)
			{
				System.out.println("Thread Interrruppted");
				
			}
			
		}
	}

	
}

public class ThreadSleepMain
{

	public static void main(String[] args)
	{
		SleepExample t1=new SleepExample();
		t1.start();
	

	}

}
