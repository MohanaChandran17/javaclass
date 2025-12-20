package array_package;

import java .util.*;
public class SumArray
{
	public static void main (String args[])
	{
		
		int [] numbers=new int[5];
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter num1 ");
		numbers[0]=scan.nextInt();
		System.out.print("Enter num2 ");
		numbers[1]=scan.nextInt();
		System.out.print("Enter num3 ");
		numbers[2]=scan.nextInt();
		System.out.print("Enter num4 ");
		numbers[3]=scan.nextInt();
		System.out.print("Enter num5 ");
		numbers[4]=scan.nextInt();
		
		System.out.println(numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4]);
		
		
		
		scan.close();
		
	}

}
