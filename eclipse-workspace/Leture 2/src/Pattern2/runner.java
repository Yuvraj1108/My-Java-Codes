package Pattern2;
import java.util.Scanner;
public class runner {
    
	public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        for(int i=1; i<=n; i++)
        {   
            int k = n - i + 1;
            for(int j=1; j<=n; j++)
            {
                if(j == k) {System.out.print("*");}
                else{System.out.print(n-j+1);}
            }
            System.out.println();
        }
	}
}