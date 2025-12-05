package package_1;
    class studentss
    {
    	int id;
    	String name;
    	studentss(int id,String name)
    	{
    		this.id=id;
    		this.name=name;
    	}
    	studentss(studentss s)
    	{
    		this.id=s.id;
    		this.name=s.name;
    	}
    	 void display() {
    	    	   System.out.println("Student id  is   : "+id);
    	    	   System.out.println("Student name is   : "+name);
    	    }
    }
   
public class SuperWithConstructor
{
  public static void main(String args[]) 
  {
	  studentss obj1=new studentss(100,"mohan");
	  obj1.display();
	  
  }
  
  }

