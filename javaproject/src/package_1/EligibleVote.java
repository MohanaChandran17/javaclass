package package_1;

public class EligibleVote
{
	public int person(int num)
	{
		return num;
	}
	public static void main(String[] args)
	{
		EligibleVote obj1=new EligibleVote();
		int age =obj1.person(23);
		
		if(age>=18)
		{
			System.out.println("eligible to vote");
		}
		else
		{
			System.out.println("Not eligible");
		}
		
		}
	}
 
// Write a method that accepts an age (int) as parameter and checks whether the person is eligible to vote.