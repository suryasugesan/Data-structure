package Searching;
import java.util.Arrays;
import java.util.Scanner;

public class Binarysearch {
	public static void main(String []args)
	{
		
		System.out.println("enter the elements in array");
		Scanner sc=new Scanner (System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		Arrays.sort(arr);
		
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("enter the target");
		int a=sc.nextInt();
		
		int l=0;
		int r=size-1;
		while(l<=r)
		{
			int mid=(l+r)/2; 
		
		if (arr[mid] == a) {
			System.out.println("Number found at index"+mid);
            return; 
        }

        
        if (arr[mid] < a) {
            l = mid + 1;
        } 
        
        else {
            r = mid - 1;
        }
    }
		System.out.println("target not found");

   
	}
		
		
	}
