package package_1;
import java.util.Scanner;
public class Ifelse
{

	public static void main(String[] args)
	{
		
		Scanner sacn=new Scanner(System.in);
		int age=sacn.nextInt();
		if (age>=18)
		{
			System.out.println("eligible for vote");
		}
		else
		{
			System.out.println("not eligible for vote");
		}
		

	}

}
