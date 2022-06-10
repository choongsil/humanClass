public class Car {
	Tire[] tires;

	public Car() {
		this.tires = new Tire[4];
		this.tires[0] = new Tire(6, "�տ���");
		this.tires[1] = new Tire(2, "�տ�����");
		this.tires[2] = new Tire(3, "�ڿ���");
		this.tires[3] = new Tire(4, "�ڿ�����");

	}

	int run() {
		System.out.println("���� �޸��ϴ�.");
		for (int i = 0; i < this.tires.length; i++) {
			if (!this.tires[i].roll()) {
				this.stop();
				return i + 1;
			}
		}
		return 0;
	}

	void stop() {
		System.out.println("���� ����ϴ�.");
	}

}
