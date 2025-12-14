package package_2;

import java.util.Scanner;

public class Assignment13_Que1
{
    public static void main(String[] args)
    {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scan.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++) 
            {
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println("Matrix is:");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();  
        }
    }
}

