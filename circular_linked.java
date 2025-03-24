package day5;

public class circular_linked {
	Node last;
	class Node
	{
		int data;
		Node next=null;
		Node (int val)
		{
			data=val;
			next=null;
		}
	}
	public circular_linked()
	{
		last=null;
	}
	public void insertAtBegin(int val)
	{
		Node newnode=new Node(val);
		if(last==null) 
		{
		last=newnode;
		last.next=last;
		}
		else
		{
			Node temp=last.next;
			last.next=newnode;
			newnode.next=last;
			last.next=newnode;
		}
	}
	public void display()
	{

    Node temp= last.next; 
    do {
        System.out.print(temp.data + " ");
        temp= temp.next;
    } while (temp!= last.next); 

    System.out.println(); 
}
	public void deleteAtBegin()
	{
		Node temp=last.next;
		last.next=last.next.next;
		temp.next=null;
	}
	}

			
		
	


