
public class insertionsort {
	
	public static void insertionSort(int[] arr){

        int n = arr.length;
        
        for(int i = 0; i<n; i++)
        {
            int idx = i-1;
            int temp = arr[i];
            
            while(arr[i] < arr[idx] && idx>=0)
            {
                arr[idx + 1] = arr[idx];
                idx++;
            }
            arr[idx + 1] = temp;
        }
    }

	public static void main(String[] args) {
		
		int arr[] = {2, 4, 1, 7, 3, 5};
		insertionSort(arr);
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}

}
