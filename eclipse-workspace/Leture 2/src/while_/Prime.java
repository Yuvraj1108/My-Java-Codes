package while_;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 2;
		while(i <= (n/2 +1))
		{
			if(n%i == 0 ) 
			{
				System.out.println("Not Prime");
				return;
			}
			i++;
		}
		System.out.println("Prime");
	}

}
