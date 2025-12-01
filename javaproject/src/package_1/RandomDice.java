package package_1;
import java.util.Random;

public class RandomDice
{
	public static void main(String args[])
	{
		Random ran=new Random();
		int dice=ran.nextInt(6)+1;
		System.out.println("you rolled :"+dice);
		
	}

}
