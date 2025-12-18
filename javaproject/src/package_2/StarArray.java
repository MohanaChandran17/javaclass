package package_2;

public class StarArray 
{

	public static void main(String[] args)
	{
		int num=5;
		for(int i=num;i>=1;i--)
		{
			for(int s=num;s>i;s--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
				
			}System.out.println();
		}
	}

}
