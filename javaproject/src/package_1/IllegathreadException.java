package package_1;

public class IllegathreadException
{

	public static void main(String[] args)
	{
		Thread thread =new Thread(()->
		{
			System.out.println("Thread Running");
		});
		

	}

}
