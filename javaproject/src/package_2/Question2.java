package package_2;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) 
    {
    	Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scan.nextInt();
        int[] arr = new int[size + 1];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) 
        {
            arr[i] = scan.nextInt();
        }
        System.out.print("Enter element to insert: ");
        int element = scan.nextInt();
        System.out.print("Enter position (0 to " + size + "): ");
        int pos = scan.nextInt();
        for (int i = size - 1; i >= pos; i--)
        {
            arr[i + 1] = arr[i];
        }
        arr[pos] = element;
        System.out.println("Array after insertion:");
        for (int i = 0; i <= size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

