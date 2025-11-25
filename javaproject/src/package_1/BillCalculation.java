package package_1;

public class BillCalculation
{

	public static void main(String[] args)
	{
		double OriginalPrice= 999.99;
		int Discount=10;
		
		double finalpric =OriginalPrice-(OriginalPrice*Discount/100.0) ;
		System.out.println("final price: "+finalpric);

	}

}
