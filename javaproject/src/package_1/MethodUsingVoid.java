package package_1;
import java.util.Scanner;

public class MethodUsingVoid
{
	public void message(String type)
	{
		System.out.println("your message is "+ type);
	}

	public static void main(String[] args)
	{
		System.out.println("enter msg");
		Scanner scan=new Scanner(System.in);
		String message1=scan.nextLine();
		MethodUsingVoid obj1=new MethodUsingVoid();
		obj1.message(message1);
		
		
		
		
		

	}

}
