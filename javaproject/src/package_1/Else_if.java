package package_1;
import java.util.Scanner;

public class Else_if
{

	public static void main(String[] args)
	{
		Scanner sacn=new Scanner(System.in);
		System.out.print("enter mark: ");
		int mark=sacn.nextInt();
		if (mark>=90)
		{
			System.out.println("A");
		}
		else if (mark>=75)
		{
			System.out.println("B");
		}
		else if (mark>=60)
		{
			System.out.println("C");
		}
		else
		{
			System.out.println("fail");
		}
		

	}

}
