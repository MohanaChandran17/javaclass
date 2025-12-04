package package_1;


 class SingleInheritance // parent class
	{
	     void eat()
	     {
	        System.out.println("the animal eat");
	     }
	}
	class dog extends SingleInheritance   //dog inherites animal
	{
	    void run()
	    {
	        System.out.println("the dog run");
	    }
	}
	class cat extends  dog   // cat inherites dog
	{
	    void sleep()
	    {
	        System.out.println("the cat sleep");
	    }
	    public static void main(String args[])
	    {
	        cat obj1=new cat();
	        obj1.eat();

	    }
	    
	}


