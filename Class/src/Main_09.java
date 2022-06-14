import java.util.Scanner;

public class Main_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m=sum(sc.nextInt(), sc.nextInt());
		System.out.println(m);
		
		

	}
	
	public static int sum(int A, int B) {
		int sub=A+B;
		return sub;
	}

}
