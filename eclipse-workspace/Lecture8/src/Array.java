
import java.util.Scanner;
public class Array {
	
	public static int largest(int arr[])
	{
		int max = 0;
		int n = arr.length;
		for(int i = 0; i<n; i++)
		{
			if(max<arr[i]) {max = arr[i];}
		}
		return max;
	}
	
	public static int[] input()
	{
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		
		for(int i = 0; i<size; i++)
		{
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void print(int arr[])
	{	
		int n = arr.length;
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = input();
		print(arr);
		System.out.println(largest(arr));

	}

}
