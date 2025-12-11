package package_2;
import java.util.Scanner;
class StaticExample
{
	static final int limit=10;
}

public class StaticFinal_Question2
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the current users");
		int userCount =scan.nextInt();
		if(userCount>StaticExample.limit)
		{
			System.out.println("Count exceeds this limit");
		}
		else if(userCount>=StaticExample.limit)
		{
			System.out.println("The current users Count is same the limit");
		}
		else
			System.out.println("Count not exceeds this limit");

	}

}
//Write a program where a static final variable defines the maximum limit
//of users, and check whether a given count exceeds this limit
