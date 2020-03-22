package patterns;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int j = 1;
		while(i<=n)
		{	
			int k = 1;
			while(k<=i)
			{
				System.out.print(j);
				j++;
				k++;
			}
			System.out.println();
			i++;
		}
	}

}
