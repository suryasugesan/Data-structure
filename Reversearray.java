package Reversearray;
import java.util.Scanner;
public class Reversearray {
	public static void main(String []args)
	{
Scanner sc=new Scanner (System.in);
System.out.println("enter the size of an array");
int size =sc.nextInt();
int[] num = new int[20];
for(int i=0;i<size;i++)
{
	num[i]=sc.nextInt();
	
}
for(int i=0;i<size;i++)
{
	System.out.println(num[i]);
	
}
for(int i=0;i<size/2;i++)
{
	int temp =num[i];
	num[i]=num[size-i-1];
	num[size-i-1]=temp;
}
System.out.println("reversed string");
for(int i=0;i<size;i++)
{
	
	System.out.println(num[i]);
}

	}

}
