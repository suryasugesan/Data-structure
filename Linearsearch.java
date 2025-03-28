package Searching;
import java.util.Arrays;
import java.util.Scanner;

public class Linearsearch {
	public static void Linear(int temp[],int f)
	{
		for(int i=0;i<temp.length;i++)
		{
			if(temp[i]==f)
			{
				System.out.println("match found"+i);
				return;
			}
		}
		System.out.println("not found");
	}
	public static void main(String[] args)
	
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[7];
		System.out.println("enter the value");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Enter the number:");
		int find=sc.nextInt();
		Linear(a,find);
		
	}

}
