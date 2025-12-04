package package_1;

public class Polumorphism
{
	class food
	{
		
	
	void eat (String breakfast)
	{
		
		System.out.println("breaking the fast: "+breakfast);
	}
	
		void eat (String lunch,int time)
		{
			
		System.out.println("lunch:"+lunch+"at "+time+ " pm");
	}
		void eat (String snacks,double quantity)
		{
			
		System.out.println("snacks: "+snacks+" "+"quantity"+quantity);
	}
		void eat (String dinner,boolean isLight)
		if(isLight)
		{
			
		System.out.println("dinner: "+dinner+"light meal");
	}
}

	public static void main(String[] args)
	{
		food f=new food();
		f.eat("idly");
		f.eat("briyani",2);
		f.eat("fride rise",false);
		

	}

}
