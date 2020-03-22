package classesandobjects;

public class studentuse {

	public static void main(String[] args) {
			
		student s1 = new student("abc", 25);
		System.out.println(s1.getrollno());
		System.out.println(s1.name);
		student s2 = new student("def" , 21);
		System.out.println(s1);
		s1.name = "Yuv";
		//s1.setrollno(-123);
		System.out.println(s1.getrollno());
//		System.out.println(s2.numstud + " " +s1.numstud);
//		student.numstud = 10;
		System.out.println(student.getnumstud());
		
	}

}
