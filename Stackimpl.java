package Searching;
import java.util.Stack;

public class Stackimpl {
	int num[]=new int[6];
	int top=-1;
	public void push(int n)
	{
		if(top<num.length)
		{
			++top;
			num[top]=n;
		}
		else
		{
			System.out.println("stack overflow");
		}
	}
	public void peek()
	{
		System.out.println("Top value" +num[top]);
		
		
		
	}
	public void pop()
	{
		if(top!=-1)
		{
			System.out.println("popped out"+num[top]);
			top--;
			
		}
		else
		{
			System.out.println("stack underflow");
		}
	
	}
	public static void main(String[] args)
	{
		Stackimpl s=new Stackimpl();
		s.push(6);
		s.push(3);
		s.push(9);
		s.push(8);
		s.push(7);
		s.peek();
		s.pop();
		
	}

}
