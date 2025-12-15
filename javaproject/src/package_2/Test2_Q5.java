package package_2;
import java.util.Scanner;

public class Test2_Q5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0, count = 0;
        double average;

        System.out.print("Enter the value of N: ");
        n = sc.nextInt();

        System.out.println("Alternate numbers are:");
        for (int i = 1; i <= n; i = i + 2) 
        {
        	System.out.println(i);
            sum = sum + i;
            count++;
        }

        average = (double) sum / count;

        System.out.println("Sum of alternate numbers = " + sum);
        System.out.println("Average of alternate numbers = " + average);

        sc.close();
    }
}

