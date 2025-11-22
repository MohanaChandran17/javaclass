package package_1;

public class thiskeyword{
	String myname;
	
	thiskeyword()
	{
		System.out.println("hello");
		
	}
	void SetName(String myname)
	{
		this.myname  = myname;
	}
	public static void main(String args[])
	{
		thiskeyword obj1 =new thiskeyword();
		obj1.SetName("mark");
		System.out.println(obj1.myname);
	}

}
