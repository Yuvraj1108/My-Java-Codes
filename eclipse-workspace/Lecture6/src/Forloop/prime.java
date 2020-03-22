package Forloop;
import java.util.Scanner;
public class prime {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n>=2) {System.out.println("2");}
        for(int i = 2; i<=n; i++)
        {
            boolean prime = true;
            for(int d = 2; d<=(i/2) + 1; d++)
            {
                if(i%d == 0)
                {
                    prime = false;
                    break;
                }
            }
            if(prime == true)
                {
                    System.out.println(i);
                }
        }
	}

}
