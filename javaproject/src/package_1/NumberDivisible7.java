package package_1;
import java.util.Scanner;

public class NumberDivisible7
{
     public static void main(String args[])
     {
    	 Scanner scan=new Scanner(System.in);
    	 System.out.print("Enter a number: ");
    	 int number=scan.nextInt();
    	 if(number%7==0)
    	 {
    		 System.out.println("the number is divisible ");
    	 }
    	 else
    		 System.out.println("the number is not divisible ");
    		 
     }
}
//Write a program to Check if a number is divisible by 7.