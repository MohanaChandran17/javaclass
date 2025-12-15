package package_2;
import java.util.Scanner;

public class Assign14_Q5
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        boolean isNumber = true;

        System.out.print("Enter input: ");
        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) 
        {
            char ch = input.charAt(i);

            if (ch < '0' || ch > '9') 
            {
                isNumber = false;
                break;
            }
        }

        if (isNumber) 
        {
            System.out.println("Input is a Number");
        } 
        else 
        {
            System.out.println("Input is a String");
        }

        sc.close();
    }
}

