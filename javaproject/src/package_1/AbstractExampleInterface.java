package package_1;
interface ATM
{
	private void accountNum()
	{
		System.out.println("account number 17");
	}
}
class branch implements ATM
{
	public void accountNUm()
	{
		System.out.println("account number 17");
	}
	public void holderName()
	{
		System.out.println("account holder name mohan");
	}
	
}

public class AbstractExampleInterface
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		branch obj1=new branch();
		obj1.accountNUm();
		obj1.holderName();
		
		

	}

}
