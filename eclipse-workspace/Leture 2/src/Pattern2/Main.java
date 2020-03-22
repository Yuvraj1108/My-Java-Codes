package Pattern2;

import java.util.Scanner;
import java.lang.Math;

public class Main {
	
	public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d = 0;
        int sum = 0;
        int j = n;
        while(j != 0)
        {
            j = j/10;
            d++;
        }
        int k = n;
        while(k != 0)
        {
            sum = sum + (int)Math.pow((int)k%10,d);
            k = k/10;
        }
        
        if(sum == n) {System.out.println("true");}
        else {System.out.println("false");}
	}
}
