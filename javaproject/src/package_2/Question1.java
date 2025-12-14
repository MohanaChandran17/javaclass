package package_2;

import java.util.Scanner;
public class Question1
{
    public static void main(String[] args)
    {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Enter size of array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) 
        {
            arr[i] = scan.nextInt();
        }
        System.out.print("Enter index to get element: ");
        int index = scan.nextInt();

        if (index >= 0 && index < size) 
        {
            System.out.println("Element at index " + index + " = " + arr[index]);
        } 
        else
        	System.out.println("Invalid index!");
        
    }
}


