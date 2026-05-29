package package_2;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MissingNumbers
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();

        System.out.print(" how many numbers from 1 to 10: ");
        int n = sc.nextInt();

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++)
        {
            int num = sc.nextInt();
            if (num >= 1 && num <= 10) 
            {
                numbers.add(num);
            }
        }

        System.out.println("Missing numbers from 1 to 10:");

        for (int i = 1; i <= 10; i++)
        {
            if (!numbers.contains(i)) 
            {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
