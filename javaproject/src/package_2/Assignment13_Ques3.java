package package_2;
import java.util.Scanner;

public class Assignment13_Ques3
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int rows = scan.nextInt();
		System.out.print("Enter number of columns: ");
		
	    int cols = scan.nextInt();
	    int[][] arr = new int[rows][cols];
	    System.out.println("Enter elements of the 2D array:");
	        
	    for (int i = 0; i < rows; i++)
	    {
	            for (int j = 0; j < cols; j++) 
	            {
	                arr[i][j] = scan.nextInt();
	            }
	    }
	        System.out.println("\nSum of each column:");
	        for (int j = 0; j < cols; j++) 
	        {
	        	int sum = 0;
	        	for (int i = 0; i < rows; i++) 
	        	{
	                sum += arr[i][j];
	            }

	            System.out.println("Column " + j + " = " + sum);
	        }
	    }
	}

	    
