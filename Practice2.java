import java.util.Scanner;
class aman {
	String name;
	int age;
}
public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		aman a = new aman();
//		System.out.println("enter ");
		a.name = sc.nextLine();
		a.age = sc.nextInt();
		System.out.println(a.name + a.age);

	}

}
