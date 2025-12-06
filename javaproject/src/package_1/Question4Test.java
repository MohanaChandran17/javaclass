package package_1;
class studentMiet
{
	String name;
	int marks;

void display()
{
	System.out.println("Student name is: "+name);
	System.out.println("Student mark is: "+marks);
}
}
  
public class Question4Test
{
	public static void main(String args[])
	{
		studentMiet obj1=new studentMiet();
		obj1.name="mohan";
		obj1.marks=56;
		obj1.display();
				
	}
}

