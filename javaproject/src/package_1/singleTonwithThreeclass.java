package package_1;
class single
{
	private static single obj1=new single();
	private  single()
	{
		
	}
	public static single get()
	{
		return obj1;
	}
}
class classA
{
	public void method1()
	{
		System.out.println("check 1");
	}
}
class classB
{
	
	public void method1()
	{
		System.out.println("check 1");
	}
}
class classC
{
	public void method1()
	{
		System.out.println("check 1");
	}
}

public class singleTonwithThreeclass
{

	public static void main(String[] args)
	{
		classA obj1=new classA get();

	}

}
