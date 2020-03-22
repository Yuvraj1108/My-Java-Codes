package while_;
import java.util.Scanner;
public class evenoddsum {
	
public static void main(String[] args) {
		
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int so = 0;
        int se = 0;
        
        while(n != 0)
        {
            if((n%10)%2 == 0)
            {
                se = se + n%10;
            }
            else
            {
                so = so + n%10;
            }
            
            n = (int)(n/10);
        }
        
        System.out.println(se + " " + so);
	}
}


