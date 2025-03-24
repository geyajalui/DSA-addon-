package day3;


	class Node {
	    int data;
	    Node next;
	    Node prev;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	        this.prev = null;
	    }
	}

	class DoublyLinkedList {
	    Node head;

	    // Function to insert a new node at the end of the list
	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = newNode;
	        newNode.prev = temp;
	    }

	    // Function to print the list
	    public void printList() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }

	    // Function to clone the doubly linked list
	    public DoublyLinkedList clone() {
	        DoublyLinkedList clonedList = new DoublyLinkedList();
	        Node current = head;
	        while (current != null) {
	            clonedList.insert(current.data);
	            current = current.next;
	        }
	        return clonedList;
	    }
	


	    public static void main(String[] args) {
	        DoublyLinkedList originalList = new DoublyLinkedList();
	        originalList.insert(1);
	        originalList.insert(2);
	        originalList.insert(3);
	        originalList.insert(4);

	        System.out.println("Original List:");
	        originalList.printList();

	        // Cloning the original list
	        DoublyLinkedList clonedList = originalList.clone();

	        System.out.println("Cloned List:");
	        clonedList.printList();
	    }
	}


