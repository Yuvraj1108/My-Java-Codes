import java.util.Scanner;

public class Selectionsort {
	
	public static void selection(int arr[])
	{
		int n = arr.length;
		for(int i = 0; i<n; i++)
		{	
			int min = arr[i];
			int k = i;
			for(int j = i; j<n; j++)
			{
				if(min > arr[j]) {min = arr[j]; k = j;}
			}
			int temp = min;
			arr[k] = arr[i];
			arr[i] = min;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = s.nextInt();
		}
		
		selection(arr);
		for(int i = 0; i<n; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
	}

}
