package Day4;

public class clone {
	class Node {
	    int data;
	    Node next;
	    Node prev;

	    Node (int data)
	    {
	        this.data = data;
	        this.next = null;
	        this.prev = null;
	    }
	}

	class DoublyLinkedList {
	    Node head;

	    
	    public void append(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node last = head;
	        while (last.next != null) {
	            last = last.next;
	        }
	        last.next = newNode;
	        newNode.prev = last;
	    }

	    
	    public void printList() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	   
	    public DoublyLinkedList clone() {
	        if (head == null) {
	            return null;
	        }

	        
	        Node current = head;
	        Node cloneHead = null;
	        Node cloneTail = null;

	        while (current != null) {
	            Node cloneNode = new Node(current.data);
	            if (cloneHead == null) {
	                cloneHead = cloneNode;
	                cloneTail = cloneNode;
	            } else {
	                cloneTail.next = cloneNode;
	                cloneNode.prev = cloneTail;
	                cloneTail = cloneNode;
	            }
	            current = current.next;
	        }

	       
	        current = head;
	        Node cloneCurrent = cloneHead;

	        while (current != null) {
	            if (current.next != null) {
	                cloneCurrent.next = cloneCurrent.next; // already set in the first loop
	            }
	            if (current.prev != null) {
	                cloneCurrent.prev = cloneCurrent.prev; // already set in the first loop
	            }
	            current = current.next;
	            cloneCurrent = cloneCurrent.next;
	        }

	       
	        DoublyLinkedList clonedList = new DoublyLinkedList();
	        clonedList.head = cloneHead;
	        return clonedList;
	    }
	}

	
	public class Main {
	    public static void main(String[] args) {
	    	clone l=new clone();
	        clone.DoublyLinkedList dll =l.new DoublyLinkedList();
	        dll.append(1);
	        dll.append(2);
	        dll.append(3);

	        System.out.println("Original list:");
	        dll.printList();

	        DoublyLinkedList clonedList = dll.clone();

	        System.out.println("Cloned list:");
	        clonedList.printList();
	    }
	}

}
