package package_2;
import java.util.*;

public class DequeueImplmentation
{

	public static void main(String[] args)
	{
	   Deque<String> dq=new ArrayDeque();
	   
	   // add a Element 
	   dq.add("Welcome to sla");
	   dq.addFirst("i am addinf first");
	   System.out.println("After add and add first ");
	   
	   dq.addLast("last");
	   System.out.println("After addLast  "+dq);
	   
	   // remove a element
	   dq.removeFirst();
	   System.out.println("After removeFirst "+dq);
	   dq.removeLast();
	   System.out.println("After removeLast "+dq);
	   
	   dq.peekFirst();
	   dq.offerFirst("hai hello");
	   dq.offerLast("hey hello");
	   
	   

	}

}
