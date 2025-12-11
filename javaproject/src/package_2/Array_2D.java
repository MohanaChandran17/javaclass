package package_2;
import java.util.Scanner;

public class Array_2D
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter rows");
		int rows=scan.nextInt();
		System.out.println("Enter rows");
		int cols =scan.nextInt();
		
		int[][] arr=new int[rows][cols];
		System.out.println("Enter array elements");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=scan.nextInt();
			}
			
		}
		System.out.println("2D array");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
			
	}

}
