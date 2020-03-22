package Forloop;
import java.util.Scanner;
import java.lang.Math;
public class Squareroot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int i = 0;
        while(Math.pow(i,2) <= n)
        {
            i++;
        }
        
        i--;
        System.out.println(i);
	}

}
