package package_1;
import java.util.Scanner;

public class DesignMethod1
{
	public int calculateTotal(int m1,int m2,int m3)
	{
		return m1+m2+m3;
	}

	public static void main(String[] args)
	{
		
	DesignMethod1 obj1=new DesignMethod1();
	int total=	obj1.calculateTotal(10,40,20);
	System.out.println("Total Mark is: "+total);
		

	}

}
//Method name: calculateTotal Parameters: int m1, int m2, int m3 Return total