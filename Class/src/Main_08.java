import java.util.Scanner;

public class Main_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 데이터

		// 6층 12개의방 1번째 손님
		for (int i = 1; i <= T; i++) {
			int H = sc.nextInt(); // 층수
			int W = sc.nextInt(); // 방수
			int N = sc.nextInt(); // 몇번째손님
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
