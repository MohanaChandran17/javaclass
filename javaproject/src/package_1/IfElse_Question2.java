package package_1;
import java.util.Scanner;

public class IfElse_Question2
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=scan.nextInt();
		if(num % 2 != 0)
		{
			System.out.println("the number is odd");
			
		}
		else
		{
			System.out.println("the number is even");
		}
		

	}

}
//Write a program to check if a given number is even or odd using `if-else