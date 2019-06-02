package data_structure;

class Node {
	public Node next;
	public Node previous;
	public int data;

	public void printData() {
		System.out.println("{ " + data + " } ");
	}
}

public class DoublyLinkedList {

	private static Node head;
	private Node tail;
	private int size;

	public boolean isEmpty() {
		return head == null;
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		newNode.previous = null;

		if (head != null)
			newNode.previous = newNode;
		head = newNode;
		if (tail == null)
			tail = newNode;
		size++;

	}

	// insert Last
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		newNode.previous = tail;

		if (tail != null)
			tail.next = newNode;
		tail = newNode;
		if (head == null)
			head = newNode;
		size++;
	}

	public Node deleteFirst() {
		if (size == 0)
			throw new RuntimeException("Doubly linked list is already empty");
		Node temp = head;
		head = head.next;
		head.previous = null;
		size--;
		return temp;
	}

	public Node deleteLast() {
		Node temp = tail;
		tail = tail.previous;
		tail.next = null;
		size--;
		return temp;
	}

	public static void main(String args[]) {
		DoublyLinkedList dl = new DoublyLinkedList();
		// dl.insertFirst(1);
		// dl.insertFirst(2);
		// dl.insertFirst(3);
		// dl.insertFirst(4);
		// dl.insertFirst(5);
		dl.insertLast(1);
		dl.insertLast(2);
		dl.insertLast(3);
		dl.insertLast(4);
		dl.insertLast(5);
		dl.printList();
		// System.out.println("*************DELETION*********************");
		// dl.deleteFirst();
		System.out.println("*************DELETION FROM END***************");
		dl.deleteLast();
		dl.printList();
		System.out.println("Size = " + dl.size);
	}

	public void printList() {
		Node current = head;
		System.out.println("Linked list = ");
		while (current != null) {
			current.printData();
			current = current.next;
		}
		System.out.println();
	}
	
}
