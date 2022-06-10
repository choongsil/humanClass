import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int y = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			y += find(Integer.parseInt(st.nextToken()));
		}
		System.out.println(y);

	}

	public static int find(int x) {
		int count = 0;
		if (x == 1) {
			count = 0;
		} else if (x == 2) {
			count = 1;
		} else if (x > 2) {

			for (int i = 2; i < x; i++) {
				if (x % i != 0) {
					count = 1;
				} else {
					break;
				}
			}
		}

		return count;
	}
}
