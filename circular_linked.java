package Single;

public class circular_linked {
	Node last;
	
	class Node
	
	{
		int data;
		Node next=null;
		
	Node(int val)
	{
		data=val;
		next=null;
		}
}
	circular_linked()
	{
		last=null;
	}
	public void insertAtbegin(int val)
	{
		Node newnode=new Node(val);
		if(last==null)
		{
			last=newnode;
			last.next=last;
		}
		else
		{
			newnode.next=last.next;
		last.next=newnode;
		
		}
	}
	public void display()
	{
		Node temp=last.next;
		while(temp!=last)
		{
			System.out.println(temp.data+" "); 
			temp=temp.next;
		}
		System.out.println(temp.data);
		}
	public void insertAtend(int val)
	{
		Node newnode=new Node(val);
		if(last==null)
		{
			last=newnode;
			last.next=last;
		}
		else
		{
			newnode.next=last.next;
		last.next=newnode;
		last=newnode;
		}
	}
	public void deleteAtbegin()
	{
		
		Node temp=last.next;
		last.next=last.next.next;
		temp.next=null;
	}
			
		

	
	public static void main(String[] args)
	{
		circular_linked l=new circular_linked();
		l.insertAtbegin(10);
		l.insertAtbegin(30);
		l.insertAtbegin(40);
		l.insertAtbegin(50);
		l.insertAtend(20);
		l.insertAtbegin(60);
		l.deleteAtbegin();
		l.display();
		
	}
}
	
	
		
		
	



	
	
	
	