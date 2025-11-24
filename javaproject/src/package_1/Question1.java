package package_1;
import java.util.Scanner;
public class Question1
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your id: ");
		int employeeid=scan.nextInt();
		
		Scanner scan2=new Scanner(System.in);
		System.out.print("Enter your name: ");
		String employeename=scan2.nextLine();
		
		Scanner scan3=new Scanner(System.in);
		System.out.print("Enter your salary: ");
		int empSalary=scan3.nextInt();
		
		Scanner scan4=new Scanner(System.in);
		System.out.print("Enter your designation: ");
		String empdesignation=scan4.nextLine();
		
		Scanner scan5=new Scanner(System.in);
		System.out.print("Enter your city: ");
		String empcity=scan5.nextLine();
		
		System.out.println("employeeid= "+employeeid);
		System.out.println("employeename= "+employeename);
		System.out.println("Enter salary= "+empSalary);
		System.out.println("Emp designation: "+empdesignation);
		System.out.println("Emp city: "+ empcity);
		
		
		
		
		
	}

}
