package package_2;

import java.util.Scanner;

public class Question5
{
    public static void main(String[] args) 
    {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Enter size of first array: ");
        int size1 = scan.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter " + size1 + " elements for first array:");
        for (int i = 0; i < size1; i++)
        {
            arr1[i] = scan.nextInt();
        }
        System.out.print("Enter size of second array: ");
        int size2 = scan.nextInt();
        int[] arr2 = new int[size2];

        System.out.println("Enter " + size2 + " elements for second array:");
        for (int i = 0; i < size2; i++) 
        {
            arr2[i] = scan.nextInt();
        }
        if (size1 != size2) 
        {
            System.out.println("Arrays are NOT equal.");
            return;
        }
        boolean isEqual = true;
        for (int i = 0; i < size1; i++)
        {
            if (arr1[i] != arr2[i])
            {
                isEqual = false;
                break;
            }
        }

        if (isEqual)
        {
            System.out.println("Arrays are EQUAL.");
        } else
        {
            System.out.println("Arrays are NOT equal.");
        }
    }
}

