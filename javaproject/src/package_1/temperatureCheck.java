package package_1;
import java.util.Scanner;

public class temperatureCheck
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
	
		 System.out.print("Enter temperature in C: ");
	        int temp = scan.nextInt();

	        if(temp >= 35){
	            System.out.println("Hot Temperature");
	        }
	        else if(temp >= 20){
	            System.out.println("Warm Temperature");
	        }
	        else{
	            System.out.println("Cold Temperature");

	}

}
}
// Write a program to Check if temperature is Hot, Warm, Cold
