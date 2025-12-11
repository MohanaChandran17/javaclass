package package_1;
class SingleImplementation
{
	private  SingleImplementation()
	{
		
	}
	private static SingleImplementation obj1=new SingleImplementation(); // global access point
	public static SingleImplementation get() //get is a method name
	{
		return obj1;  // must return object
	}
	public void display() 
	{
		System.out.println("singleton working");
	}
	class check
	{
		public void showMessage()
		{
			SingleImplementation obj4=SingleImplementation.get();
			obj4.display();
		}
	}
	
}

public class SingleTon1
{

	public static void main(String[] args)
	{
		SingleImplementation obj1= SingleImplementation.get();  //new keyword is not use
		obj1.display();
		

	}

}
