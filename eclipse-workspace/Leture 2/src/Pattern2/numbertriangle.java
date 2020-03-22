package Pattern2;
import java.util.Scanner;
public class numbertriangle {

	public static void main(String[] args) {

        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        
        int  i = 1;
        while(i<=n)
        {
            int j = 1;
            while(j <= n-i)
            {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            int l = i;
            while(k<=i)
            {
                System.out.print(l);
                k++;
                l++;
            }
            int m = l-2;
            while(m>=i)
            {
                System.out.print(m);
                m--;
            }
            System.out.println();
            i++;
        }
	}

}
