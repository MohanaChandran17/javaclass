package package_2;
import java.util.Scanner;

public class StringBuffer1
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

       
        char[] result = new char[a.length + b.length];

        int i =0;
        for (int j = 0; j < a.length; j++) 
        {
            result[i++] = a[j];
        }

        // Copy second string
        for (int j = 0; j < b.length; j++) {
            result[i++] = b[j];
        }
        String output = new String(result);

        System.out.println("Result: " + output);
    }
}
