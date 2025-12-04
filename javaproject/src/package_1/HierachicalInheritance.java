package package_1;

class Animal  // parent class
{
      void eat()
      {
    	  System.out.println("This animal eat foods");
      }
}
    

class dog extends Animal //dog inherites animal
{
     void run()
     {
    	 System.out.println("This dog run ");
     }
}
   
class Cat  extends Animal // cat inherites dog
{
    void meow()
    {
    	System.out.println("cat meows");
    }
}


public class HierachicalInheritance
{
  public static void main(String args[])
  {
	  dog obj1=new dog();
	  obj1.eat();
	  obj1.run();
	  Cat obj2=new Cat();
	  obj2.meow();
	  

	  
  }
}
