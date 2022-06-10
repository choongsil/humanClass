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
			System.out.println("실행매개값의 수가 부족합니다.");
			System.out.println("[실행방법]");
			System.out.println("java ExceptionSample num1 num2");
			return;
//		} catch (NumberFormatException e) {
//			System.out.println("숫자로 변환할수 없습니다.");
//		}catch(ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다.");
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println("0이상의 숫자로만 입력하십시오.");
		} catch (Exception e) {
			System.out.println("알수없는 예외상황 처리");
			e.printStackTrace();
		} finally {
			System.out.println("다시 실행하세요");
		}

		/*
		 * Scanner s = new Scanner(System.in); int n = 20; int x = 1; try { x =
		 * Integer.parseInt(s.nextLine()); } catch (NumberFormatException e) {
		 * System.out.println("입력된 숫자가 정상적이지 않습니다."); } s.close(); try {
		 * System.out.println(n / x); } catch (Exception e) {
		 * System.out.println("프로그램이 비정상 종료합니다."); } }
		 */

	}
}