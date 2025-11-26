package package_1;
class animal
{
	String name;
	int age;
	
	void makesound()
	{
		System.out.println("the animal make sound");
	}
}


public class Zoo
{

	public static void main(String[] args)
	{  
		animal obj1=new animal();
		obj1.name="mohan";
		obj1.age=18;
		obj1.makesound();
	}

}
