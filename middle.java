package Daytwo;

public class middle {
	 class LinkedList {
	   
	    static class Node {
	        int data;
	        Node next;

	        
	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }
	    Node head = null;

	    
	    public void insertAtEnd(int data) {
	        Node newNode = new Node(data);

	        
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node temp = head;
	            while (temp.next != null) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	        }
	    }

	    
	    public void findMiddle() {
	        if (head == null) {
	            System.out.println("The list is empty.");
	            return;
	        }

	        Node slow = head;
	        Node fast = head;

	        
	        while (fast != null && fast.next != null) {
	            slow = slow.next;          
	            fast = fast.next.next;     
	        }

	       
	        System.out.println("The middle element is: " + slow.data);
	    }

	    
	    public void printList() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        middle l = new middle();
	        middle.LinkedList list=l.new LinkedList();
	        
	        list.insertAtEnd(10);
	        list.insertAtEnd(20);
	        list.insertAtEnd(30);
	        list.insertAtEnd(40);
	        list.insertAtEnd(50);

	        
	        System.out.println("Original Linked List:");
	        list.printList();

	        
	        list.findMiddle();
	    }
	}


}
