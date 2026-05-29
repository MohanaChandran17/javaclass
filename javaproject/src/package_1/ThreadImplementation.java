package package_1;

public class ThreadImplementation
{

	private static Thread t;

	public static void main(String[] args)
	{
	      for(int i=1;i<=5;i++)
	      {
	    	  final int threadNumber=i;
	    	  // thread creation
	    	  Thread t=new Thread(()->
	    	  {
	    		  System.out.println("Thread is running "+threadNumber+"is running");
	    		  
	    	  });
	    	  t.start(); //thrad started
	    	  
	      }
	      try
	      {
	    	 
			  
			  t.join();//wait for current thread to finish
	      }
	      catch(InterruptedException e)
	      {
	    	  e.printStackTrace();
	      }

	}

}
