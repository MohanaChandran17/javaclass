package package_1;
class father
{
	void eat()
	{
		System.out.println("the father eat");
	}
}

public class MethodOverriding extends father

{
	@Override
	void eat()
	{
		super.eat();
		System.out.println("the father eat");
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		father obj1=new MethodOverriding();
		obj1.eat();
		
		

	}

}
