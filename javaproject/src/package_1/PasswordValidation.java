package package_1;
import java.util.Scanner;


public class PasswordValidation
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a password");
		String password=scan.nextLine();
		
		for(int i=0;i<password.length();)
		{
			if(i>6)
			{
				System.out.println("the password valid");
			}
			else
			{
				System.out.println("the password Invalid");
			}
			
		}

	}

}


// 1.Write a program to
///Validate a password: i)length > 6
//ii)must contain a number
