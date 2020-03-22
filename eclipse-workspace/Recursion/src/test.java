import java.util.Scanner;

public class test {

	private static boolean ispal(String input, int n)
{
    if(n == input.length()/2)
    {
    if(input.charAt((input.length()-1)/2) == input.charAt(input.length()-1 - (input.length()-1)/2))
        {return true;}
    return false;    
    }    
    
    if(input.charAt(n) == input.charAt(input.length()-n-1))
    {return ispal(input, n+1);}
    return false;
}

public static boolean isStringPalindrome(String input) {
    return ispal(input, 0);
}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(isStringPalindrome(input));
	}
}
