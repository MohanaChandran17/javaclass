package package_1;

public class car
{
	String model;
	int year;
	
	void display()
	{
		System.out.println("car model: "+model+" "+"car year: "+year);
	}
	

	public static void main(String[] args)
	{
		car obj1=new car();
		obj1.model="bmw";
		obj1.year=2010;
		obj1.display();
		
		obj1.model="benz";
		obj1.year=2005;
		obj1.display();
		
		

	}

}
