package package_1;

public class Constructer
{
	class mainConstructer
	{
		  name="mohan";
	}
	void display()
	{
		System.out.println(name);
	}
	
	
 public static void main(String args[])
 {
	 Constructer obj=new  Constructer();
	 mainConstructer obj1=obj.new mainConstructer();
	obj.display();
	 
	
 }
}
