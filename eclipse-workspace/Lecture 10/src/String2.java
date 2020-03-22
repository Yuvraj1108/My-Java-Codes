import java.util.Scanner;
public class String2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int counter = 0;
        String str = s.nextLine();
        
        if(str.isEmpty()) {System.out.println("0");}
        
        for(int i=0; i<str.length(); i++)
        {    
            if(str.charAt(i) == ' ') {counter++;}
        }
        
        System.out.println(counter);
        str.
	}

}
