package Reversearray;
import java.util.Arrays;
import java.util.Scanner;
public class array {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr =new int[20];
		System.out.println("enterthe array size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
		  arr[i]=sc.nextInt();	
		}
		for(int i=0;i<size;i++)
		{
		  System.out.println(arr[i]);
		}
		System .out.println("enter the delete pos:");
		int delpos=sc.nextInt();
		for(int mypos=delpos-1;mypos<size;mypos++)
		{
			arr[mypos]=arr[mypos+1];
		}
		size--;
		System.out.println(Arrays.toString(arr));
		
	}
}
	


