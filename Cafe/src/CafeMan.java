
import java.util.Scanner;

//C=> ���޴���, �������� �Է� �޴´�, �޴�����Ʈ(arName,arPrice)�� �߰�
//U=>�����޴���ȣ, ���޴���, ������ �Է¹޴´�, �ش��ȣ�� �޴���� ������ ����
//D=>�����޴���ȣ �Է� �޴´�, �޴�����Ʈ�� ����
//�޴����
//�۾��� �����Ѵ� ->x:�޴����� ����
public class CafeMan {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Menu menu = new Menu();
		Sales sales = new Sales();
		System.out.println("�۾��� �����Ͻÿ�[o:�ֹ��ޱ�, s:���⺸��, m:�޴����� x:���α׷�����]");
		menu.build();
		String str = s.nextLine();
		while (!str.equals("x")) {
			Order order = new Order();// �ݺ��� ����� orderŬ���� �ʱ�ȭ
			if (str.equals("s")) {
				sales.display();

			} else if (str.equals("o")) {
				menu.display();
				System.out.println("�޴���ȣ�� �����Ͻÿ�.");
				str = s.nextLine();
				while (!str.equals("")) {
					int ndx = Integer.parseInt(str) - 1;
					System.out.println("������ �Է��Ͻÿ�.");
					str = s.nextLine();
					int net = menu.getArPrice(ndx);
					order.setOrder(menu.getArName(ndx), Integer.parseInt(str), net * Integer.parseInt(str));
					menu.display();
					System.out.println("�޴���ȣ�� �����Ͻÿ�.");
					str = s.nextLine();
				}
				int sum = order.display();
				System.out.println("����Ϲ�ȣ�� �Է��Ͻʽÿ�.");
				String mobile = s.nextLine();
				sales.setAll(mobile, sum);

			} else if (str.equals("m")) {
				while (!str.equals("X")) {
					System.out.println("�۾��� �����Ͻÿ�[C:�űԸ޴��߰�, U: �����޴�����, D: �����޴�����, X: �޴���������");
					str = s.nextLine();
					if (str.equals("C")) {// �űԸ޴� �߰�
						menu.menuEdit();
					} else if (str.equals("U")) {// �����޴� ����
						menu.menuEdit1();
					} else if (str.equals("D")) {// �����޴� ����
						menu.menuEdit2();
					} else if (str.equals("X")) {// �޴����� ����
						menu.display();
					}
				}
			}
			System.out.println("�۾��� �����Ͻÿ�[o:�ֹ��ޱ�, s:���⺸��, m:�޴�����, x:���α׷�����]");
			str = s.nextLine();

		}
		System.out.println("���α׷��� ���� �մϴ�.");
	}
}
