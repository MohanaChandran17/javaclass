package package_2;

import java.util.Scanner;

public class Array_Question1
{
    public static void main(String[] args) 
    {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Enter the size of array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++)
        {
            arr[i] = scan.nextInt();
        }
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < size; i++)
        {
            if (arr[i] % 2 == 0)
            {
                evenCount++;
            } 
            else
             oddCount++;
            }

        System.out.println("Even Numbers: " + evenCount);
        System.out.println(" Odd Numbers: " + oddCount);

      scan.close();
    }
}

