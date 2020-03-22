import java.util.Scanner;
public class nameavg {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        char d = str.charAt(0);
        
        int avg = (a+b+c)/3;
        
        System.out.println(d);
        System.out.println(avg);

	}

}
