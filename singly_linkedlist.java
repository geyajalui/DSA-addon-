package day_2;

public class singly_linkedlist {
	public static void main(String []args) {
		linked l=new linked();
		l.insertAtBegin(60);
		l.insertAtBegin(50);
		l.insertAtBegin(40);
		l.insertAtBegin(30);
		l.insertAtBegin(20);
		l.insertAtBegin(10);
		l.display();
		l.insertAtBegin(777);
		l.insertAtAnyPos(4, 333);
		l.display();
		l.deleteAtBegin();
		l.display();
		l.deleteAtPosition(5);
		l.display();
		
				
	}
	
}
