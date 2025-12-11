package package_2;
import java.util.Scanner;

public class ArrayLargestNumber
{
	public static void main(String[] args)
	{
	  Scanner scan=new Scanner(System.in);
	  int size;
	  int sum=0;
	  
	  System.out.println("Enter the size");
	   size=scan.nextInt();
	   int []a=new int[size];
	   System.out.println("Enter the elements"+size);
	   for(int i=0;i<a.length;i++)
	   {
		   a[i]=scan.nextInt();
	   }
	   int min =a[0];
	   for(int i=1;i<a.length;i++)
	   {
		   if(a[i]<min)
		   {
			   min=a[i];
		   }
	   }
	 
	   System.out.println("minimum= "+min);
	}

}
