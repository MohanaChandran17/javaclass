package package_1;
class Car1
{
	private String carName;
	private double mileage;
	private String fuelType;
	
	car1(String carName)
	{
		  this.carName=carName;
	}
	car1(String carName,double mileage)
	{
		this.carName=carName;
		this.mileage=mileage;
	}
	car1(String carName,double mileage,String furlType)
	{
		this.carName=carName;
		this.mileage=mileage;
		this.fuelType=fuelType;
	}
	public String getCarName()
	{
		return carName;
	}
	public void setCarName(String carName)
	{
		this.carName=carName;
	}
	public double getMileage()
	{
		return mileage;
	}
	public void setMileage(double mileage)
	{
		this.mileage=mileage;
	}
	public String getFuelType()
	{
		return fuelType;
	}
	public void setFuelType(String  fuelType)
	{
		this. fuelType= fuelType;
	}
	

   void cardetails()
   {
       System.out.println("Car Name  : " + carName);
       System.out.println("Mileage   : " + mileage + " km/l");
       System.out.println("Fuel Type : " + fuelType);
       System.out.println("-----------------------------");
   }
}

public class Question4
{

	public static void main(String[] args)
	{
		car1 obj1=new car1("BMW");
		car1 obj2=new car1("Shift",205.8);
		car1 obj3=new car1("Rolls-Royce",205.8,"PETROL");
		

		obj1.cardetails();
		obj1.cardetails();
		obj1.cardetails();
		
		
		

	}

}
  
/*4. Write a program using constructor overloading for Car Mileage Calculator

Create a class Car:

Constructor 1: accepts car name
Constructor 2: accepts car name + mileage
Constructor 3: accepts car name + mileage + fuel type
Print the car summary. */