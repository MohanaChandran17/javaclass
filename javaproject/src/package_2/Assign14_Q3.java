package package_2;
import java.util.Scanner;

public class Assign14_Q3
{
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();
        System.out.println("Armstrong numbers between " + start + " and " + end);

        for (int i = start; i<= end; i++) 
        {
            int temp = i;
            int digits = 0;
            int sum = 0;
            int n = i;
            while (n > 0) 
            {
                digits++;
                n = n / 10;
            }

            // Armstrong sum
            n = i;
            while (n > 0) {
                int digit = n % 10;
                int power = 1;

                for (int j = 1; j <= digits; j++)
                {
                    power = power * digit;
                }

                sum = sum + power;
                n = n / 10;
            }

            if (sum == temp) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}


