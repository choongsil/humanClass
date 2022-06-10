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
	private ArrayList<Integer> arPrice; // �ʵ�

	Menu() { // ������
		this.arName = new ArrayList<String>();
		this.arPrice = new ArrayList<Integer>();// �ʱ�ȭ �κ�
	}

	public void display() {
		for (int i = 0; i < this.arName.size(); i++) {
			System.out.println((i + 1) + "." + this.getArName(i) + "," + this.getArPrice(i));
		}
	}

	public void setArName(String str) { //�ʵ忡 �� �߰�
		this.arName.add(str);
	}

	public void setArPrice(int Price) { //�ʵ忡 �� �߰�
		this.arPrice.add(Price);
	}

	public String getArName(int i) {  //�ʵ忡�� �� ��������
		return this.arName.get(i);
	}

	public int getArPrice(int i) { //�ʵ忡�� �� ��������
		return this.arPrice.get(i);
	}

	public void fileWrite() {
		try { // ������ ���� �����
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

	public void menuEdit() {// �űԸ޴��߰�
		this.display();
		System.out.println("���޴��� �Է����ּ��� ex)���޴���, ������)");
		String me = s.nextLine();
		String[] ar = me.split(",");
		this.setArName(ar[0]);
		this.setArPrice(Integer.parseInt(ar[1]));
		this.fileWrite();
		this.display();
	}

	public void menuEdit1() {// �����޴� ����
		this.display();
		System.out.println("������ �޴� ��ȣ�� �Է��ϼ���");
		int num = Integer.parseInt(s.nextLine());
		System.out.println("���޴���, �������� �Է����ּ���");
		String newMenu = s.nextLine();
		String[] ar = newMenu.split(",");
		this.arName.set(num - 1, ar[0]);
		this.arPrice.set(num - 1, Integer.parseInt(ar[1]));
		this.fileWrite();
		this.display();

	}

	public void menuEdit2() { // �����޴� ����
		this.display();
		System.out.println("������ �޴���ȣ�� �Է��ϼ���.");
		int num = Integer.parseInt(s.nextLine());
		this.arName.remove(num - 1);
		this.arPrice.remove(num - 1);
		this.fileWrite();
		this.display();
	}
}
