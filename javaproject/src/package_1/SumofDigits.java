package package_1;
import java.util.Scanner;

public class SumofDigits
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter random number: ");
		int num=scan.nextInt();
		int rem;
		int sum=0;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			
		}
		System.out.println(sum);
		
		
	}

}

// Write a program to calculate the sum of digits of a number using a while loop