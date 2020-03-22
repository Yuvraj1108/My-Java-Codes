package ifelse;

import java.util.Scanner;

public class Largestof3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int j = s.nextInt();
		int k = s.nextInt();
		
		if(i>=j && i>=k)	
		{System.out.println(i + "is MAX");}
		else if(j>=i && j>=k)	
		{System.out.println(j + "is MAX");}
		else if(k>=i && k>=j)	
		{System.out.println(k + "is MAX");}
	}

}
