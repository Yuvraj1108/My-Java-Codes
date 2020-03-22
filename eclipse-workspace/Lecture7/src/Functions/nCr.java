package Functions;
import java.util.Scanner;
public class nCr {

	public static int factorial(int n)
	{
		int i = 1;
		int mul = 1;
		while(i<=n)
		{
			mul = mul*i;
			i++;
		}
		return mul;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		
		System.out.println((factorial(n)/(factorial(r)*factorial(n-r))));
	}

}
