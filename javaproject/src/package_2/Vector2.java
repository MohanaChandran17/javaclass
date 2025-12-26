package package_2;
import java.util.Vector;

public class Vector2 {
    public static void main(String[] args) 
    {
    	Vector<Integer> numbers = new Vector<Integer>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        
        Vector<Integer> evenNumbers = new Vector<Integer>();
        Vector<Integer> oddNumbers = new Vector<Integer>();


        for (int i = 0; i < numbers.size(); i++) 
        {
            int num = numbers.get(i);

            if (num % 2 == 0) 
            {
                evenNumbers.add(num);
            }
            else
            {
                oddNumbers.add(num);
            }
        }

        // Display result
        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Odd Numbers: " + oddNumbers);
    }
}
