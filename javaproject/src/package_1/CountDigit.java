package package_1;
import java.util.Scanner;

public class CountDigit
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number");
		int number=scan.nextInt();
      	int count=0;
		while(number!=0)
		{ 
			number=number/10;  //remove last digit
			count++;
		}
		System.out.println(count);
		
		

	}

}
// Write a program to Count digits in a number (ex: 5678 → 4 digits)