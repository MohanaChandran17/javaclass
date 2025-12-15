package package_2;
import java.util.Scanner;

public class Test2_Q2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int day, month, year;

        System.out.print("Enter today's day: ");
        day = sc.nextInt();

        System.out.print("Enter today's month: ");
        month = sc.nextInt();

        System.out.print("Enter today's year: ");
        year = sc.nextInt();

        System.out.println("Today's Date: " + day + "-" + month + "-" + year);

        sc.close();
    }
}
