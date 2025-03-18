import java.util.Scanner;

class Student{
	Scanner sc = new Scanner(System.in);
	private int sid;
	private String name;
	private String course;
	
	public void setInfo() {
		System.out.println("Enter Sid, Name, Courseb : ");
		sid = sc.nextInt();
		name = sc.next();
		course = sc.next();
	}
	public void getInfo() {
		sid = 01;
		System.out.println("sid :"+sid+"\t"+"Name : "+name+"\t"+"Course : "+course);
	}
	
}
public class Practice3 {

	public static void main(String[] args) { 
		
		Student st = new Student();
		
		st.setInfo();
		st.getInfo();
		
		
	}

}
