package package_1;

interface Animal  // parent class
{
      void eat();
}
    

interface dog //dog inherites animal
{
     void run();
}
   
class Cat implements Animal,dog  // cat inherites dog
{
    public void eat()
    {
        System.out.println("the cat eat ");
    }
    public void run()
    {
    	System.out.println("the cat run");
    }
    public void Sleep()
    {
    	System.out.println("the cat Sleep");
    }
}


public class MultipleInheritance
 {
    public static void main(String args[])
    {
        Cat obj1=new Cat();
        obj1.eat();
        obj1.run();
        obj1.Sleep();

    }
    
}

