package package_1;
import java.util.Scanner;

public class EmployeeDetails1
{
	int empId;
	String empName;
	double empSalary;
	
	public void setDetails(int empId,String empName,double empSalary)
	{
		 System.out.println("my id:"+empId);
		 System.out.println("My name: "+empName);
		 System.out.println("My Salary: "+empSalary);
	}

	public static void main(String[] args)
	{
		System.out.println("Enter id:");
		System.out.println("Enter Name:");
		System.out.println("Enteer salary");
		Scanner scan=new Scanner(System.in);
		int id=scan.nextInt();
		scan.nextLine();
		String name=scan.nextLine();
		double salary=scan.nextDouble();
		EmployeeDetails1 obj1=new EmployeeDetails1();
		obj1.setDetails(id,name,salary);
		                   
		
		
		

	}
                   
}
