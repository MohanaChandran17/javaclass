package package_1;
import java.util.Scanner;

public class SwitchCase_Calculator
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number: ");
		int num1=scan.nextInt();
		System.out.println("enter first secound: ");
		int num2=scan.nextInt();
		
		System.out.println("choose an operation");
		
		System.out.println("1  addition+:");
		System.out.println("2 subraction-: ");
		System.out.println("3 multiplication* : ");
		System.out.println("4  division / : ");
		
		int result;
		int choice = scan.nextInt();
		
		
		switch(choice)
		{
		case 1:
			result=num1+num2;
			System.out.println("result is: "+result);
            break;
            
		case 2:
			result=num1-num2;
			System.out.println("result is: "+result);
            break;
            
		case 3:
			result=num1*num2;
			System.out.println("result is: "+result);
            break;
            
		case 4:
		
			result=num1/num2;
			System.out.println("result is: "+result);
            break;
            
		}
	    
			
		
		
		
		
		

	}

}
