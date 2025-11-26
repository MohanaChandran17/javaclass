package package_1;

public class BillCalculation
{

	public static void main(String[] args)
	{
		double OriginalPrice= 999.99;
		int Discount=10;
		
		double finalpric =(double)(OriginalPrice*Discount/100);
		System.out.println("final price: "+(OriginalPrice-finalpric));
		
		
	}

}
