import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String[] s = br.readLine().split(""); // 원래배열
			if (s[0].equals("0"))
				break;
			String[] y = new String[s.length];// reverse 받을 배열선언
			for (int i = 0; i < s.length; i++) {
				y[i] = s[s.length - i - 1];
			}
			int count = 0;
			for (int i = 0; i < y.length; i++) {
				if (s[i].equals(y[i])) {
					count++;
				}

			}
			if (count == s.length) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}
