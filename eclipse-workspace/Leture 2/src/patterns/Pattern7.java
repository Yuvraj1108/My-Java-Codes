package patterns;
import java.util.Scanner;
public class Pattern7 {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
	        int a = s.nextInt();
	        
	        int i = 1;
	        while(i<=a)
	        {
	            char c = (char)('A' + a - i);
	            int j = 1;
	            while(j<=i)
	            {
	                System.out.print(c);
	                c = (char)(c + 1);
	                j++;
	            }
	            System.out.println();
	            i++;
	        }
	}

}
