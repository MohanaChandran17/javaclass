package package_2;

import java.util.Queue;
import java.util.*;

public class QueueImplementation
{
	public static void main(String args[])
	{
		//queue implement
		Queue<Integer> q=new LinkedList<>();
		//add 
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		
		System.out.println("The queue list is "+q);
		System.out.println("The queue remove is "+q.remove());
		System.out.println("The queue poll is "+q.poll());
		System.out.println("The queue peek is "+q.peek());
		System.out.println("The queue Offer  is "+q.offer(10));
		System.out.println("The queue elememt is "+q.element());
		
		
	}
	

}
