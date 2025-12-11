package package_2;
class StaticCount
{
	static int num;

StaticCount()
{
	num++;
}
}

public class Static_Question3
{

	public static void main(String[] args)
	{
		StaticCount obj1=new StaticCount();
		StaticCount obj2=new StaticCount();
		StaticCount obj3=new StaticCount();
		StaticCount obj4=new StaticCount();
		System.out.println("Number of Objects created using a static variable is : "+StaticCount.num);
       
	}

}

//Write a program to count the number of objects created using a static variable