import java.util.Scanner;
public class runner {
	public static String reverseEachWord(String input) {
        
        String str = "";
        
        for(int i=0; i<input.length()-1; i++)
        {
            int j = i;
            while(i< input.length() && input.charAt(i) != ' '){i++;}
            int k = i-1;
            while(k>=j)
            {
                str = str + input.charAt(k);
                k--;
            }
            str = str + " ";
        }
        return str;
	}



	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(reverseEachWord(input));
	}
}