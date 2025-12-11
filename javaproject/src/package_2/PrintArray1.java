package package_2;
import java.util.Scanner;

public class PrintArray1
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
	   System.out.println("Array elements");
	   for(int i=0;i<a.length;i++)
	   {
		   System.out.println( a[i]+" ");
	   }
	   for(int i=0;i<a.length;i++)
	   {
		   sum+=a[i];
	   }
	   System.out.println("sum= "+sum);
	   
	   
	  

	}

}
