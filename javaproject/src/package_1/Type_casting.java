package package_1;

public class Type_casting
{
	public static void main(String args[])
	{
		/* byte b=10;
		short s=b;
		int i=s;
		long l=i;
		float f=l;
		double d=f;
		
		System.out.println("byte "+" "+b);
		System.out.println("short "+" "+s);
		System.out.println("int "+" "+i);
		System.out.println("long "+" "+l);
		System.out.println("float "+" "+f);
		System.out.println("double"+" "+d); */
		
		// narrowing/explicit type casting
		
		double d=123.432;
		float f=(float)d;
		long l=(long)f;
		int i=(int)l;
		short s=(short)i;
		byte b=(byte)s;
		
		System.out.println("byte "+" "+b);
		System.out.println("short "+" "+s);
		System.out.println("int "+" "+i);
		System.out.println("long "+" "+l);
		System.out.println("float "+" "+f);
		System.out.println("double"+" "+d);
		 
		
		
		
		
	}

}
