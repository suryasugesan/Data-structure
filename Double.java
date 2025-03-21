package Single;

import Single.Doublelinkedlist.Node;

public class Double {
	Node head;
	Node tail;
	class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int val)
		{
			data=val;
			next=null;
			prev=null;
			
		}
		}
	public Double(){
		head=null;
	}
	public void insertAtbegin(int val)
	{
		Node newNode=new Node(val);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			Node temp=head;
			newNode.next=temp;
			head=newNode;
		}
	}
		public void display()
		{
			Node temp = head;
			while(temp!=null)
			{
				System.out.println(temp.data+" ");
				temp=temp.next;
			}
		}
		public void displayusingprev()
		{
			Node temp=tail;
			while(temp!=null)
			{
				System.out.println(temp.data+" ");
				temp=temp.prev;
			}
		}
		
		public void deleteAtposition(int delpos)
		{
			Node temp=head;
			Node dtemp =null;
			for(int i=0;i<delpos-1;i++)
			{
				dtemp=temp;
				temp=temp.next;
			}
			dtemp.next=temp.next;
		}
		
		
		
		public void deleteAtbegin()
		{
			head=head.next;
		}
		public void Doubleinsertbegin(int val)
		{
			Node newNode =new Node(val);
			if(head==null)
			{
				head=newNode;
				tail=newNode;
			}
			else
			{
				Node temp=head;
				newNode.next=temp;
				head=newNode;
				temp.prev=newNode;
			}
			
			}
		public static void main(String[] args)
		{
			Double l= new Double();
			
			l.Doubleinsertbegin(7);
			l.Doubleinsertbegin(9);
			l.Doubleinsertbegin(8);
			l.Doubleinsertbegin(45);
			l.Doubleinsertbegin(89);
			l.deleteAtposition(5);
			l.deleteAtbegin();
			System.out.println("display the values");
			
			
			l.display();
			System.out.println("displaying the previous: ");
			l.displayusingprev();
		}
}
			
			

                                                                                                                                                                                  
