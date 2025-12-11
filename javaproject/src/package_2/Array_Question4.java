package package_2;

import java.util.Scanner;

public class Array_Question4 
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
        System.out.println("even indexes:");

        for (int i = 0; i < size; i++) 
        {
            if (i % 2 == 0) 
            {
                System.out.println( " " + arr[i]);
            }
        }

        scan.close();
    }
}

