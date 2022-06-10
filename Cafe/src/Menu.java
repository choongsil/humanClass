import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	Scanner s = new Scanner(System.in);
	private ArrayList<String> arName;
	private ArrayList<Integer> arPrice; // 필드

	Menu() { // 생성자
		this.arName = new ArrayList<String>();
		this.arPrice = new ArrayList<Integer>();// 초기화 부분
	}

	public void display() {
		for (int i = 0; i < this.arName.size(); i++) {
			System.out.println((i + 1) + "." + this.getArName(i) + "," + this.getArPrice(i));
		}
	}

	public void setArName(String str) { //필드에 값 추가
		this.arName.add(str);
	}

	public void setArPrice(int Price) { //필드에 값 추가
		this.arPrice.add(Price);
	}

	public String getArName(int i) {  //필드에서 값 가져오기
		return this.arName.get(i);
	}

	public int getArPrice(int i) { //필드에서 값 가져오기
		return this.arPrice.get(i);
	}

	public void fileWrite() {
		try { // 수정후 파일 덮어쓰기
			String filePath = "D:\\temp\\menu.txt";
			FileWriter fw = new FileWriter(filePath, false);
			for (int i = 0; i < arName.size(); i++)
				fw.write(this.arName.get(i) + "," + this.arPrice.get(i) + "\r\n");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void build() {
		try {
			BufferedReader input = new BufferedReader(
					new InputStreamReader(new FileInputStream("D:\\temp\\menu.txt"), "EUC-KR"));

			String line = input.readLine();
			while (line != null) {
				String[] ar = line.split(",");
				this.setArName(ar[0]);
				this.setArPrice(Integer.parseInt(ar[1]));
				line = input.readLine();
			}
			input.close();
		}

		catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

		}
	}

	public void menuEdit() {// 신규메뉴추가
		this.display();
		System.out.println("새메뉴를 입력해주세요 ex)새메뉴명, 새가격)");
		String me = s.nextLine();
		String[] ar = me.split(",");
		this.setArName(ar[0]);
		this.setArPrice(Integer.parseInt(ar[1]));
		this.fileWrite();
		this.display();
	}

	public void menuEdit1() {// 기존메뉴 수정
		this.display();
		System.out.println("수정할 메뉴 번호를 입력하세요");
		int num = Integer.parseInt(s.nextLine());
		System.out.println("새메뉴명, 새가격을 입력해주세요");
		String newMenu = s.nextLine();
		String[] ar = newMenu.split(",");
		this.arName.set(num - 1, ar[0]);
		this.arPrice.set(num - 1, Integer.parseInt(ar[1]));
		this.fileWrite();
		this.display();

	}

	public void menuEdit2() { // 기존메뉴 삭제
		this.display();
		System.out.println("삭제할 메뉴번호를 입력하세요.");
		int num = Integer.parseInt(s.nextLine());
		this.arName.remove(num - 1);
		this.arPrice.remove(num - 1);
		this.fileWrite();
		this.display();
	}
}
