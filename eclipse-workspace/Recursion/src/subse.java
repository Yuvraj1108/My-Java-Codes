import java.util.Scanner;
import java.util.ArrayList;

public class subse {
	
	 private static int[] merge(int[] arr1, int[] arr2)
	    {
	        int l1 = arr1.length;
	        int l2 = arr2.length;
	        
	        int res[] = new int[l1+l2];
	        int j = 0; int k = 0;
	        for(int i=0; i<l1+l2; i++)
	        {
	            if(j>=l1) {res[i] = arr2[k]; k++;}
	            else if(k>=l2) {res[i] = arr1[j]; j++;}
	            else if(arr1[j] >= arr2[k]) {res[i] = arr2[k]; k++;}
	            else {res[i] = arr1[j]; j++;}
	        }
	        
	        return res;
	    }
	    
		public static void mergeSort(int[] input){
			
	        if(input.length <= 1){return;}

	        int l = input.length - 1;
	        int mid = l/2;
	        
	        int arr1[] = new int[mid+1];
	        int arr2[] = new int[l-mid];
	        
	        
	        for(int i=0; i<mid+1; i++)
	        {
	            arr1[i] = input[i];
	        }
	        for(int j=0; j<l-mid; j++)
	        {
	            arr2[j] = input[j+mid+1];
	        }
	        
	        mergeSort(arr1);
	        mergeSort(arr2);
	        
	        int sol[] = new int[l+1];
	        sol = merge(arr1, arr2);
	        
	        for(int k = 0; k<l+1; k++)
	        {
	            input[k] = sol[k];
	        }
			
		}
		
		public static void intersection(int[] arr1, int[] arr2){
			int l1 = arr1.length;
	        int l2 = arr2.length;
	        

	        mergeSort(arr1);
	        mergeSort(arr2);
	        
	        int i = 0;
	        int j = 0;
	        while(i<l1 && j<l2)
	        {
	        if(arr1[i] == arr2[j])
	        {
	             System.out.println(arr1[i]);
	            i++;
	            j++;
	        }
	        else if(arr1[i] > arr2[j])
	        {
	            j++;
	        }
	        else if(arr1[i] < arr2[j])
	        {
	            i++;
	        }
	        }
	            
	        }

	        static Scanner s = new Scanner(System.in);
	    	public static int[] takeInput() {
	    		int size = s.nextInt();
	    		int arr[] = new int[size];
	    		for (int i = 0; i < size; i++) {
	    			arr[i] = s.nextInt();
	    		}
	    		return arr;
	    	}

	    	public static void print(ArrayList<Integer> list) {
	    		for (int i : list) {
	    			System.out.print(i+" ");
	    		}
	    	}
	    	
	    	public static void main(String[] args) {
	    		int[] arr1 = takeInput();
	    		int[] arr2 = takeInput();
	    		intersection(arr1, arr2);
	    	}
}

