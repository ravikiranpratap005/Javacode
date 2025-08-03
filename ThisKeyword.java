package basics;

public class ThisKeyword 
{
	int studnet_id;
	String student_name;
	double studen_stipend;
	
	void student(int student_id, String student_name, double student_stipend)
	{
		this.studnet_id = student_id;
		System.out.println("Selected for the scholarship.");
		this.studen_stipend = student_stipend;
	}
	
	public static void main(String[] args)
	{
		ThisKeyword tk = new ThisKeyword();
		System.out.println(tk.studnet_id);
		tk.student(123,"ravi",123.123);
		System.out.println(tk.studnet_id);
		System.out.println(tk.student_name);
		System.out.println(tk.studen_stipend);
	}
}
