import java.util.Scanner;
public class stringreverse {
	
public static String reverseWordWise(String input) {
        
        String reverse = "";
        
        int e = (input.length() - 1);
        while(e != 0)
        {
            
            if(e>=0) {
        while(input.charAt(e) != ' ' )
        {
            e--;
        }
            
        int i = e+1;
        e--;
            
        while(input.charAt(i) != ' ' && i<input.length())
        {
            reverse = reverse + input.charAt(i);
            i++;
        }    
            if(e>=0)
            {reverse = reverse + " ";}
            else e = 0;
            
        }    
        }
        return reverse;
        
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String str2 = reverseWordWise(str.);
		System.out.println(str2);
	}

}
