package package_1;

public class Question2method
{
	public int square(int num)
	{
		return num*num;
	}
	public static void main(String args[])
	{ 
		Question2method obj1=new Question2method();
	   int result= obj1.square(17);
	   
		System.out.println("the square is : "+result);
		
		
	}

}
//  Write a method that takes a number and returns its square