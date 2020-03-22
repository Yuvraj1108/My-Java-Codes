package patterns;

import java.util.Scanner;
public class Pattern5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int i = 1;
        
        while(i <= n)
        {	
        	int l = i;
        	while(l< n)
            {
                System.out.print(" ");
                l++;
            }
            int j = i;
            int k = 1;
            while(k <= i)
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