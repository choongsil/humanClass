
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = Integer.parseInt(s.nextLine());
		int b = Integer.parseInt(s.nextLine());
		int min;
		if (a < b) {
			min = a;
		} else {
			min = b;
		}
		int num = 0;
		for (int i = 2; i <= min; i++) {
			if (a % i == 0 && b % i == 0)
				num = i;
		}
		int qwe = a / num;
		int ty = b / num;
		if (num != 0) {
			System.out.println("�μ��� �ִ� �����:" + num);
			System.out.println("�μ��� �ּ� �����:" + num * qwe * ty);
		} else {
			System.out.println("�μ��� �ִ������� �ּ� ������� �����ϴ�.");
		}
	}

}