
public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		Tire tire1 =new HankookTire();
		Tire tire2 =new KumhoTire();
		
		System.out.println(tire2 instanceof HankookTire);
		System.out.println(tire1 instanceof Tire);
		System.out.println(tire1 instanceof KumhoTire);
		
//		for (int i = 0; i < 5; i++) {
//			int nPunkTire = car.run();
//			switch (nPunkTire) {
//			case 1:
//				System.out.println(car.tires[nPunkTire-1].location+"�� HankookTire�� ��ü");
//				car.tires[nPunkTire-1] = new HankookTire(15, "�տ���");
//				break;
//			case 2:
//				System.out.println(car.tires[nPunkTire-1].location+"�� KumhoTire�� ��ü");
//				car.tires[nPunkTire-1]=new KumhoTire(13,"�տ�����");
//				break;
//			case 3:
//				System.out.println(car.tires[nPunkTire-1].location+"�� HankookTire�� ��ü");
//				car.tires[nPunkTire-1]=new HankookTire(14,"�ڿ���");
//				break;
//			case 4:
//				System.out.println(car.tires[nPunkTire-1].location+"�� KumhoTire�� ��ü");
//				car.tires[nPunkTire-1]=new KumhoTire(17,"�ڿ�����");
//				
//			}
//			System.out.println("---------------------");
//		}
//		System.out.println("�� �޷Ƚ��ϴ�.");
	}

}
