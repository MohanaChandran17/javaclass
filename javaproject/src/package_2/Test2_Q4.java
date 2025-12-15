package package_2;
import java.util.Scanner;

public class Test2_Q4
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        double average;

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        average = (double) sum / n;

        System.out.println("Average of array elements = " + average);

        sc.close();
    }
}

