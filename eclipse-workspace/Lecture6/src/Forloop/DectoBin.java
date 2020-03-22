package Forloop;
import java.util.Scanner;
import java.lang.Math;
public class DectoBin {
		
	public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        
	        long l = 0L;
	        int counter = 0;
	        while(n!=0)
	        {
	           l = l + (long)((n%2)*Math.pow(10,counter));
	           n = n/2;
	           counter++;
	        }
	        System.out.println(l);
	}     
}
