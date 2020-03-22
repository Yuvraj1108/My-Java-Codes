
public class Logical {

	public static void main(String[] args) {
		int i = 12;
		int j = 25;
		System.out.println(i>=j && i>j);
		System.out.println(i>=j || i>j);
		System.out.println(i>=j || i<=j);
		System.out.println(i>=j || i==j);
		System.out.println(!(i>=j) && !(i>j));
	}

}
