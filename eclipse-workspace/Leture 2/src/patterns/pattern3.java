package patterns;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int j = 1;
		while(i<=n)
		{	
			int k = 1;
			int m = 1;
			while(m <= n-i)
			{
				System.out.print(" ");
				m++;
			}
			while(k<=i)
			{	
				int l = k;
				System.out.print(j);
				j++;
				k++;
			}
			System.out.println();
			i++;
		}
	}

}
