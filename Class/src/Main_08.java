import java.util.Scanner;

public class Main_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // �׽�Ʈ ������

		// 6�� 12���ǹ� 1��° �մ�
		for (int i = 1; i <= T; i++) {
			int H = sc.nextInt(); // ����
			int W = sc.nextInt(); // ���
			int N = sc.nextInt(); // ���°�մ�
			int floor = N % H;
			if (N % H == 0) {
				floor = H;
				System.out.println((floor * 100)+(N / H));
			}else {
				System.out.println((floor * 100)+(N / H)+1);
			}
		}
	}

}
