package package_1;
import java.util.Scanner;

public class NumberDivisible
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number: ");
		int number=scan.nextInt();
		int b=2;
	
		int count=0;
		while(number%b==0)
		{
			 number=number/b;
			 count++;
			 
			 
		}
		System.out.println(count);
		

	}

}
//Write a program to Count how many times a number is divisible by 2 (example: 40 → divides 3 times