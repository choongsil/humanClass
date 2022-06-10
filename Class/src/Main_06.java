
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> list = new ArrayList<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		for (int k : list) {
			sb.append(k).append('\n');
		}
		System.out.println(sb);
	}

}
