package classesandobjects;

public class dynamicarray {
	
	int arr[];
	int nextidx;
	int arrsize;
	
	public dynamicarray()
	{
		arr = new int[2];
		arrsize = 2;
		nextidx = 0;
	}
	
	public void add(int n)
	{
		if(nextidx >= arrsize)
		{
			restructure();
		}
		arr[nextidx] = n;
		nextidx++;
	}
	
	private void restructure()
	{
		int temp[] = arr;
		arr = new int[2*arrsize];
		for(int i=0; i<arrsize; i++)
		{
			arr[i] = temp[i];
		}
		arrsize = 2*arrsize;
	}
	
	public void setto(int i, int n)
	{
		if(i > nextidx)
		{
			return;
		}
		arr[i] = n;
	}
	
	public void print()
	{
		for(int i=0; i<nextidx; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
