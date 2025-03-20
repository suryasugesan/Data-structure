package Reversearray;
import java.util.Scanner;
public class Rotate {
	public static void main(String [] args)
	{
		int[] arr =new int[20];
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the array size:");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			 arr[i]=sc.nextInt();
		}
		int temp=arr[0];
		arr[0]=arr[size-1];
		temp=0;
		i++;
		for(int i=0;i<size;i++)
		{
			 System.out.println(arr[i]);
		}
		
		
	}

}
