package package_2;

import java.util.LinkedList;

public class LinkedListExample {
	class 	Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	Node head;//Node fixed to be at head
//	1.Insert at the begining 
	void insertAtBeginning(int data)
	{
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
	}
//	2.Insert to the end
	void insertAtend(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
	}
//	delete a node
	void delete (int key)
	{
		Node temp=head,prev =null;
		if(temp!=null&& temp.data==key)
		{
			head=temp.next;
			return;
		}
		while(temp!=null&& temp.data!=key)
		{
			prev=temp;
			temp=temp.next;
		}
		if(temp==null)
		{
			System.out.println("Element not found");
			return;
		}
		prev.next=temp.next;
	}
//	search element
	boolean search(int key)
	{
		Node temp=head;
		while(temp!=null)
		{
			if(temp.data==key)
			{
				return true;
			}
			
	}return false;
	}
//	length of the list
	int length()
	{
		int count=0;
		Node temp=head;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		return count;
	}
//	Display list
	void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("Null");
	}
//	reverse a list
	void reverse()
	{
		Node prev=null,curr=head,next;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			
			head=prev;
		}
	}
	public static void main(String[] args) {
		LinkedListExample list=new LinkedListExample();
		list.insertAtBeginning(10);
		list.insertAtBeginning(20);
		list.insertAtend(30);
		list.display();
		System.out.println("Length"+list.length());
		list.delete(20);
		list.display();
		System.out.println("Search 10"+list.search(10));

	}

}