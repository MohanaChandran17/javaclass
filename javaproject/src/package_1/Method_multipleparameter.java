package package_1;
import java.util.Scanner;
public class Method_multipleparameter
{
	public int add(int a,int b,int c)  //non static
	{
		 return a+b+c;
		 
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first number");
		int num1=scan.nextInt();
		System.out.println("enter the secound number");
		int num2=scan.nextInt();
		System.out.println("enter the secound number");
		int num3=scan.nextInt();
		Method_multipleparameter obj1=new Method_multipleparameter();
	int result=obj1.add(num1,num2,num3);
		System.out.println(result);
		
	      

	}

}
