package package_2;

import java.util.Scanner;

public class Array_Question2
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
        System.out.println("Reversed Array:");
        
        for (int i = size - 1; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }

        scan.close();
    }
}

