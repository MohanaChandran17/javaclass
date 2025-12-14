package package_2;
import java.util.Scanner;

public class Assignment13_Ques4                                                                                                                                                            
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

	        int evenCount = 0;
	        int oddCount = 0;
	        for (int i = 0; i < rows; i++)
	        {
	            for (int j = 0; j < cols; j++) 
	            {
	                if (arr[i][j] % 2 == 0)
	                    evenCount++;
	                else
	                    oddCount++;
	            }
	        }

	        System.out.println("Total Even Numbers = " + evenCount);
	        System.out.println("Total Odd Numbers = " + oddCount);
	    }
	}


