package package_2;
import java.util.Scanner;

public class Test2_Q1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int birthDay, birthMonth;
        int currentDay, currentMonth;

        System.out.print("Enter your birth day: ");
        birthDay = sc.nextInt();

        System.out.print("Enter your birth month: ");
        birthMonth = sc.nextInt();

        System.out.print("Enter current day: ");
        currentDay = sc.nextInt();

        System.out.print("Enter current month: ");
        currentMonth = sc.nextInt();

        if (birthDay == currentDay && birthMonth == currentMonth) 
        {
            System.out.println(" Happy Birthday");
        } else 
            System.out.println("Today is not your Birthday.");
        

        sc.close();
    }
}

