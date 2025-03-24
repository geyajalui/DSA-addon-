package day5;

public class circular_access {
	public static void main(String[]args) {
		circular_linked c=new circular_linked();
		c.insertAtBegin(60);
		c.insertAtBegin(50);
		c.insertAtBegin(40);
		c.insertAtBegin(30);
		c.insertAtBegin(20);
		c.insertAtBegin(10);
		c.display();
		System.out.println();
		c.deleteAtBegin();
		c.display();
		
	}

}
