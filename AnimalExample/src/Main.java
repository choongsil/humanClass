import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[26];
		String str = s.next().toUpperCase();
		char c = '?';
		int max=-1;
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)-65]++;
			if(max<arr[str.charAt(i)-65]) {
				max=arr[str.charAt(i)-65];
				c=str.charAt(i);
			}
			else if(max==arr[str.charAt(i)-65])c='?';
		}
		
		
		System.out.println(c);
	}
}