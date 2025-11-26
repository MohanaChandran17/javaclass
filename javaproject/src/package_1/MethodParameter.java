package package_1;

public class MethodParameter
{
	public static void sayhello() //method with no parameter
	{
		System.out.println("hello");
	}
	public static void student(String name)
	{
		System.out.println("name: "+name);
	}

	public static void main(String[] args)
	{

		sayhello(); //method calling
		student("mohan");
		student("chandran");

	}

}
