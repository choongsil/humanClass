import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_03 {
	public static int ar[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ar = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i=0;i<N;i++) {
			ar[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(ar);
		int M = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < M; j++) {
			if (search(Integer.parseInt(st.nextToken())) >= 0) {
				sb.append(1).append("\n");
			} else {
				sb.append(0).append("\n");
				;
			}
		}
		System.out.println(sb);
	}

	public static int search(int key) {
		int min = 0;
		int max = ar.length - 1;
		while (min <= max) {
			int mid = (min + max) / 2;
			if (key < ar[mid]) {
				max = mid - 1;
			} else if (key > ar[mid]) {
				min = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
