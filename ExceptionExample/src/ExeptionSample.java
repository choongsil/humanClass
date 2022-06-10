import java.util.Scanner;

public class ExeptionSample {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 / value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����Ű����� ���� �����մϴ�.");
			System.out.println("[������]");
			System.out.println("java ExceptionSample num1 num2");
			return;
//		} catch (NumberFormatException e) {
//			System.out.println("���ڷ� ��ȯ�Ҽ� �����ϴ�.");
//		}catch(ArithmeticException e) {
//			System.out.println("0���� ���� �� �����ϴ�.");
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println("0�̻��� ���ڷθ� �Է��Ͻʽÿ�.");
		} catch (Exception e) {
			System.out.println("�˼����� ���ܻ�Ȳ ó��");
			e.printStackTrace();
		} finally {
			System.out.println("�ٽ� �����ϼ���");
		}

		/*
		 * Scanner s = new Scanner(System.in); int n = 20; int x = 1; try { x =
		 * Integer.parseInt(s.nextLine()); } catch (NumberFormatException e) {
		 * System.out.println("�Էµ� ���ڰ� ���������� �ʽ��ϴ�."); } s.close(); try {
		 * System.out.println(n / x); } catch (Exception e) {
		 * System.out.println("���α׷��� ������ �����մϴ�."); } }
		 */

	}
}