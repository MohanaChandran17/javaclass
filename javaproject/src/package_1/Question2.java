package package_1;
import java.util.Scanner;

public class Question2
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		float temp=scan.nextFloat();
		int storage=(int)temp;
		
		System.out.println("Sensor Temperature (float): " + temp);
        System.out.println("Stored Temperature (int): " + storage);
        System.out.println("Data Loss: " + (temp - storage));
		
		
		

	}

}
