import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MAin_02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Stack<Integer> st = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int start = 0; // ������ ������ �Է¹޾Ҵ��� �˱����Ѻ���
		while (N-- > 0) {
			int x = Integer.parseInt(br.readLine()); // ���ÿ� ���¼���
			if (x > start) {
				for (int i = start + 1; i <= x; i++) {
					st.push(i);
					sb.append("+" + "\n");
				}
				start = x;
			} else if (st.peek() != x) {
				System.out.println("NO");
				return;
			}
			st.pop();
			sb.append("-"+"\n");
		}
		System.out.println(sb);
	}

}
