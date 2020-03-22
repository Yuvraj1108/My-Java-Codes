
public class issorted {

	public static boolean checksort(int input[])
	{
		if(input.length <= 1) {return true;}
		
		int temp[] = new int[input.length - 1];
		for(int i=0; i<input.length-1; i++)
		{
			temp[i] = input[i+1];
		}
		
		boolean tempans = checksort(temp);
		if(!tempans) {return false;}
		
		if(input[0] <= input[1]) {return true;}
		else return false;
	}
	
	public static void main(String[] args) {
		
		int arr1[] = {2,5,7,9,11};
		int arr2[] = {2,7,1,4,8};
		System.out.println(checksort(arr1));
		System.out.println(checksort(arr2));
	}
}
