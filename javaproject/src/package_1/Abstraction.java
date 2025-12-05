package package_1;

abstract class sports
{
	sports()
	{
		
	}
	abstract void play(); //ab method
	void cricket()
	{
		System.out.println("play the game");
	}
}

 
public class Abstraction extends sports
{
	Abstraction()
	{
		
	}
	void play()
	{
		System.out.println("play the game");
	}
	void hit()
	{
		System.out.println("batter hit the ball");
	}
	public static void main (String args[])
	{
		Abstraction obj1=new Abstraction();
		obj1.cricket();
		obj1.hit();
	}



}
