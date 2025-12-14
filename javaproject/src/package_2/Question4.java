package package_2;
import java.util.Scanner;

public class Question4 
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
        System.out.print("Enter position to search (0 to " + (size - 1) + "): ");
        int pos = scan.nextInt();

        if (pos >= 0 && pos < size) 
        {
            System.out.println("Element at position " + pos + " = " + arr[pos]);
        } 
        else 
        {
            System.out.println("Invalid position!");
        }
    }
}



