import java.util.Scanner;

public class avg3num {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	String str = scan.next();
	System.out.println(str);
	
	char c = str.charAt(0);
	System.out.println(c);
	int i = scan.nextInt();
	int j = scan.nextInt();
	int k = scan.nextInt();
	
	int avg = (i+j+k)/3;
	System.out.println(avg);
	
	long l = scan.nextLong();
	double d = scan.nextDouble();
	


	
	}

}
