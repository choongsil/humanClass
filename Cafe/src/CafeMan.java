
import java.util.Scanner;

//C=> 새메뉴명, 새가격을 입력 받는다, 메뉴리스트(arName,arPrice)에 추가
//U=>기존메뉴번호, 새메뉴명, 새가격 입력받는다, 해당번호의 메뉴명과 가격을 수정
//D=>기존메뉴번호 입력 받는다, 메뉴리스트서 삭제
//메뉴출력
//작업을 선택한다 ->x:메뉴관리 종료
public class CafeMan {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Menu menu = new Menu();
		Sales sales = new Sales();
		System.out.println("작업을 선택하시오[o:주문받기, s:매출보기, m:메뉴관리 x:프로그램종료]");
		menu.build();
		String str = s.nextLine();
		while (!str.equals("x")) {
			Order order = new Order();// 반복문 실행시 order클래스 초기화
			if (str.equals("s")) {
				sales.display();

			} else if (str.equals("o")) {
				menu.display();
				System.out.println("메뉴번호를 선택하시오.");
				str = s.nextLine();
				while (!str.equals("")) {
					int ndx = Integer.parseInt(str) - 1;
					System.out.println("수량을 입력하시오.");
					str = s.nextLine();
					int net = menu.getArPrice(ndx);
					order.setOrder(menu.getArName(ndx), Integer.parseInt(str), net * Integer.parseInt(str));
					menu.display();
					System.out.println("메뉴번호를 선택하시오.");
					str = s.nextLine();
				}
				int sum = order.display();
				System.out.println("모바일번호를 입력하십시오.");
				String mobile = s.nextLine();
				sales.setAll(mobile, sum);

			} else if (str.equals("m")) {
				while (!str.equals("X")) {
					System.out.println("작업을 선택하시오[C:신규메뉴추가, U: 기존메뉴수정, D: 기존메뉴삭제, X: 메뉴관리종료");
					str = s.nextLine();
					if (str.equals("C")) {// 신규메뉴 추가
						menu.menuEdit();
					} else if (str.equals("U")) {// 기존메뉴 수정
						menu.menuEdit1();
					} else if (str.equals("D")) {// 기존메뉴 삭제
						menu.menuEdit2();
					} else if (str.equals("X")) {// 메뉴관리 종료
						menu.display();
					}
				}
			}
			System.out.println("작업을 선택하시오[o:주문받기, s:매출보기, m:메뉴관리, x:프로그램종료]");
			str = s.nextLine();

		}
		System.out.println("프로그램을 종료 합니다.");
	}
}
