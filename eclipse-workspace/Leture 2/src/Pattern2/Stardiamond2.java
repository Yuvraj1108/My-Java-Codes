package Pattern2;
import java.util.Scanner;

public class Stardiamond2 {

	public static void main(String[] args) {
			
		        Scanner s  = new Scanner(System.in);
		        int n = s.nextInt();
		        
			        int m = (n/2) + 1;
			        int i = 1;
			        
			        while(i <= m)
			        {    
			            int l = i;
			            while(l < m)
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
			        
					int k = n - m;
			        while(k>=1)
			        {
			            int a = 1;
			            while(a <= m-k)
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


