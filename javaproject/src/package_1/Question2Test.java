package package_1;
class person1
{
	private String name;
	private int age;
	

public String getMyname()
{
	return name;
	
}
public void  setMyname(String name)
{
	this.name=name;
}
public int getMyage()
{
	return age;
	
}
public void setMyage(int age)
{
	this.age=age;
}
void display()
{
	System.out.println("the person name is: "+name);
	System.out.println("the person age is: "+age);
}
}

public class Question2Test
{

	public static void main(String args[])
	{
		// TODO Auto-generated method stub
		person1 obj1=new person1();
		obj1.setMyname("mohan");
		obj1.setMyage(21);
		obj1.display();
		
		

	}

}
