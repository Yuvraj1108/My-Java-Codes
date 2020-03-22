package Forloop;
import java.util.Scanner;
public class fibonacci {

		public static void main(String[] args) {
			
	        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int fn1 = 1;
	        int fn2 = 1;
	        int fn3 = 0;
	        int counter = 2;
	        
	        if(n<=2) {System.out.println("1");}
	        else {
	        while(counter != n)
	        {
	             fn3 = fn2 + fn1;
	             fn1 = fn2;
	             fn2 = fn3;
	             counter++;
	        }
	           
	        System.out.println(fn3);
	        }
		}

	}
