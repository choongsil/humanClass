import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Stack<Integer> st = new Stack<Integer>();
		StringBuilder sb= new StringBuilder();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int N =Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			String [] str = br.readLine().split(" ");
			switch(str[0]) {
			case "push":
				st.push(Integer.parseInt(str[1]));
				break;
			case"pop":
				if(st.empty()) {
					sb.append("-1"+"\n");
				}else {
					sb.append(st.pop()+"\n");
				}
				break;
			case"size":
				sb.append(st.size()+"\n");
				break;
			case"empty":
				if(st.empty()) {
					sb.append("1"+"\n");
				}else {
					sb.append("0"+"\n");
					
				}
				break;
			case"top":
				if(st.empty()) {
					sb.append("-1"+"\n");
				}else {
					sb.append(st.peek()+"\n");
				}
				break;
			}
		}
		System.out.println(sb.toString());

	}

}
