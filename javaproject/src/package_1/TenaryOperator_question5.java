package package_1;

public class TenaryOperator_question5
{
	public int mark(int num1)
	{
		return num1;
	}

	public static void main(String[] args)
	{
		TenaryOperator_question5 obj1=new TenaryOperator_question5();
		int mark1=obj1.mark(87);
		System.out.println("The grade is: "+((mark1>=90)?"A":(mark1>=75)?"B":(mark1>=50)?"C":"D"));
		
		}

}


//Write a method that accepts marks and returns the grade (A, B, C…). using tenary operator