package classesandobjects;

public class student {
	public String name;
	private final int rollno;
	private static int numstud;
//	public student(String n)
//	{
//		name = n;
//	}
	
	public static int getnumstud()
	{
		return numstud;
	}
	
	public student(String name, int rollno)
	{	
		numstud++;
		//System.out.println(this);
		this.name = name;
		this.rollno = rollno;
	}
	
//	public void setrollno(int rn)
//	{
//		if(rn <= 0) {return;}
//		rollno = rn;
//	}
	
	public int getrollno()
	{
		return rollno;
	}
}
