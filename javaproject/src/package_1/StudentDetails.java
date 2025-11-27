package package_1;
import java.util.Scanner;

public class StudentDetails
{
	public void  student(String name,int id,char grade)
	{
		return ;
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.print("enter name: ");
		String name=scan.nextLine();
		System.out.print("enter id: ");
		int id=scan.nextInt();
		System.out.print("enter grade: ");
		char grade=scan.next().charAt(0);
		
		StudentDetails obj1=new StudentDetails();
		obj1.student(name,id,grade);
		
		System.out.println("the name is: "+name);
		System.out.println("the id is: "+id);
		System.out.println("the grade is:"+grade);
		}
	}
// Write a method that accepts a student's name,id,grade and prints it
