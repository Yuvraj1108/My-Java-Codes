import java.util.Scanner;

public class FehtoCel {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double feh = s.nextDouble();
		double cel = (5*(feh-32))/9;
	//  	double cel = (5/9)*(feh-32);		
		System.out.println(cel);
	}

}
