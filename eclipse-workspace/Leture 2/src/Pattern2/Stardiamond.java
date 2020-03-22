package Pattern2;
import java.util.Scanner;
public class Stardiamond {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int m = s.nextInt();
	        int n = (m/2) + 1;
	        int i = 1;
	        
	        while(i <= n)
	        {    
	            int l = i;
	            while(l < n)
	            {
	                System.out.print(" ");
	                l++;
	            }
	            int j = 1;
	            while(j <= 2*i - 1)
	            {
	                System.out.print("*");
	                j++;
	            }
	            System.out.println();
	            i++;
	        }
	        
			int k = m - n;
	        
	        while(k>=1)
	        {
	            int a = 1;
	            while(a <= n-k)
	            {
	                System.out.print(" ");
	                a++;
	            }
	            
	            int b = 1;
	            while(b <= 2*k - 1)
	            {
	                System.out.print("*");
	                b++;
	            }
	            System.out.println();
	            k--;
	        }
			
		}

	}
