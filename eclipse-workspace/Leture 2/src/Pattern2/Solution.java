package Pattern2;

import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int a = 1;
        int b = 2*n + 1;
        int c = n + 1;
        for(int i=1; i<= n; i++)
        {
            for(int j=1; j<=2*n+1; j++)
            {
                if(j == a || j == b || j == c){System.out.print("*");}
                else {System.out.print("0");}
            }
            a++;
            b--;
            System.out.println();
        }
		
	}	


}