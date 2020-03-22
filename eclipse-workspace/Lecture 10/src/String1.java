
public class String1 {
	
	public static void charprint(String s)
	{
		for(int i=0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		
		char c = 'b';
		String str = "abcdefgh";
		String str2 = "cdghfeba";
//		System.out.println(str.length());
//		System.out.println(str.charAt(3));
//		System.out.println(str.substring(2, 6));
		System.out.println(str.substring(8));
		System.out.println(str.substring(str.length()));
		System.out.println(str.contains(str2.substring(1,2)));
		charprint(str);
		System.out.println(str.chars());
		System.out.println(str.codePointCount(0, 8));
		System.out.println(str.isEmpty());
		
	}

}
