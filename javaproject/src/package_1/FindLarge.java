package package_1;
import java.util.Scanner;

public class FindLarge
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the first Number: ");
		int num1=scan.nextInt();
		System.out.print("enter the first Number: ");
		int num2=scan.nextInt();
		
		if(num1>num2)
		{
			System.out.println(" The larger number is: "+num1);
		}
		else
		{
			System.out.println("the larger number is: "+num2);
		}
		}

}

// Write a Java program to find the largest of two numbers using if-else