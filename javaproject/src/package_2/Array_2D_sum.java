package package_2;

import java.util.Scanner;

public class Array_2D_sum
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter rows");
		int rows=scan.nextInt();
		System.out.println("Enter cols");
		int cols =scan.nextInt();
		
		int[][] arr=new int[rows][cols];
		System.out.print("Enter array elements");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=scan.nextInt();
			}
			
		}
		for (int i=0;i<rows;i++)
		{
			int sum=0;
			for(int j=0;j<cols;j++)
			{
				sum+=arr[i][j];
			}
			System.out.println("sum of rows "+(i+1)+" = "+sum);
		}
}
}
