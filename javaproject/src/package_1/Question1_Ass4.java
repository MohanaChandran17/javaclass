package package_1;
import java.util.Scanner;

public class Question1_Ass4
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=scan.nextInt();
		if(num>0)
		{
			System.out.println("the number is positive");
			
		}
		else
		{
			System.out.println("the number is not positive");
		}

	}

}


// Write a Java program to check if a given number is positive . If it is, display “The number is positive”