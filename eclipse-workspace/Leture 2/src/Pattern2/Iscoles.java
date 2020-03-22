package Pattern2;
import java.util.Scanner;
public class Iscoles {
	
	public static void main(String[] args) {
		
	
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int i = 1;
	while(i <= n)
	{	
		int l = 1;
		while(l <= n-i)
		{
			System.out.print(" ");
			l++;
		}
		int j = 1;
		while(j <= i)
		{
			System.out.print(j);
			j++;
		}
		int k = i-1;
		while(k>=1)
		{
			System.out.print(k);
			k--;
		}
		
		System.out.println();
		i++;
	}
		
	}	
}
