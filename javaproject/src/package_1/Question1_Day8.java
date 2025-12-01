package package_1;
import java.util.Scanner;

public class Question1_Day8
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your Experience: ");
		int experience=scan.nextInt();
		if(experience>5)
		{
			System.out.println(" bonus =20% ");
		}
		else
			System.out.print("bonus=10%");

	}

}
// .If experience >5 years → bonus = 20%
//Else → bonus = 10%