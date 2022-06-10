import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main_01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Queue<Integer> que = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int back=0; 
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" ");
			switch (str[0]) {
			case "push":
				int x= Integer.parseInt(str[1]);
				back=x;
				que.add(x);
				break;
			case "pop":
				if (que.isEmpty()) {
					sb.append(-1+"\n");
				} else {
					sb.append(que.poll()+"\n");
				}
				break;
			case "size":
				sb.append(que.size()+"\n");
				break;
			case "empty":
				if (que.isEmpty()) {
					sb.append(1+"\n");
				} else {
					sb.append(0+"\n");
				}
				break;
			case "front":
				if (que.isEmpty()) {
					sb.append(-1+"\n");
				} else {
					sb.append(que.peek()+"\n");
				}
				break;
			case "back":
				if (que.isEmpty()) {
					sb.append(-1+"\n");
				} else {
					sb.append(back+"\n");
				}
				break;
			}
		}
		System.out.println(sb.toString());
	}

}
