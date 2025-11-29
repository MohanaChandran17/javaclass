package package_1;
import java.util.Scanner;

public class CheckAge
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("enter age: ");
		int age=scan.nextInt();
		if(age>=18 && age<50)
		{
			System.out.println("the person is adult");
		}
		else if(age>=12&&age<18)
		
			System.out.println("the person is Teenager");
		else if(age>0&&age<12)
			
			System.out.println("the person is child");
		else if(age>=50)
			
			System.out.println("the person is senior");
		else
			System.out.println("Invalid input");
       
	}

}

//Write a program to Check age category (Child, Teenager, Adult, Senior).