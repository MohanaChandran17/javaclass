/**
 * 
 */
package package_1;
class compare
{
    int a,b;
    int max(int a,int b)
    
    {
        
          if(a>b)
          {
            return a;

          }
          else
          return b;
        

    }
}
public class Question5Test 
{
    public static void main(String args[])
    
    {
        compare obj1=new compare();
        int result=obj1.max(20,50);
        System.out.println("the Larger number is: "+result);

    }
}

