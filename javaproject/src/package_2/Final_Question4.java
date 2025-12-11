package package_2;
import java.util.Scanner;

class FinalExamplee2
{
    final int intrestRate = 100;
    double simpleIntrest;
    
    public double FinalExample(double principal, double year)
    {
        simpleIntrest = (principal * intrestRate * year) / 100;
        return simpleIntrest;
    }
}

public class Final_Question4
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        FinalExamplee2 obj1 = new FinalExamplee2();
        System.out.println("Enter principal amount");
        double principal = scan.nextDouble();
        System.out.println("Enter the year");
        double year = scan.nextDouble();
        double simpleIntrest = obj1.FinalExample(principal, year);
        System.out.println("Simple Interest = " + simpleIntrest);
    }
}
