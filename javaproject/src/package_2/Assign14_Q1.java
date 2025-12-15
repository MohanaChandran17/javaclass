package package_2;
import java.util.Scanner;

public class Assign14_Q1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n, i, j;
        boolean isPrime;

        System.out.print("Enter value of N: ");
        n = scan.nextInt();
        System.out.println("Prime numbers from 1 to " + n );

        for (i = 2; i <= n; i++) 
        {
        	isPrime = true;
        	for (j = 2; j <= i / 2; j++) 
        	{
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        scan.close();
    }
}
