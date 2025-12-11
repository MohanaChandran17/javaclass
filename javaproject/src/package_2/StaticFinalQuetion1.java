package package_2;
import java.util.Scanner;
class calCulate
{
	static final double PI=Math.PI;
}

public class StaticFinalQuetion1
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius");
		double r=scan.nextDouble();
		double area=Math.PI*r*r;
		System.out.println("Area of circle: "+area);
		
		

	}

}
//Write a program where a static final variable stores the value of PI, and use it to calculate the area of a circle