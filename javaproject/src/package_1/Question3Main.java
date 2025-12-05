package package_1;
interface Payment
{
	void pay(double amount);
}
class CreditCard implements Payment 
{
	public void pay(double amount) 
    {
        System.out.println("Payment of " + amount + "Credit Card.");
    }
}
class UPI implements Payment 
{
	public void pay(double amount)
	{
        System.out.println("Payment of " + amount + "UPI.");
    }
}
public class Question3Main
{
	 public static void main(String[] args)
	 {
            Payment p1 = new CreditCard();
	        p1.pay(1000.75);
	        Payment p2 = new UPI();
	        p2.pay(400.50);
	    }
	}

