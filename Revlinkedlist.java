package Daytwo;

public class Revlinkedlist {
	 static class LinkedList {
	   
	    static class Node {
	        int data;
	        Node next;

	        
	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    Node head = null;

	    
	    public void reverse() {
	        Node prev = null;
	        Node current = head;
	        Node next = null;

	        while (current != null) {
	            next = current.next;  
	            current.next = prev;  
	            prev = current;      
	            current = next;
	        }

	        head = prev;  
	    }

	    
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

	   
	    public void printList() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	
	     LinkedList list = new LinkedList();
	     

	        
	        list.insertAtEnd(10);
	        list.insertAtEnd(20);
	        list.insertAtEnd(30);
	        list.insertAtEnd(40);

	        
	        System.out.println("Original Linked List:");
	        list.printList();

	        
	        list.reverse();

	        
	        System.out.println("Reversed Linked List:");
	        list.printList();
	    }
	 }
}

	



