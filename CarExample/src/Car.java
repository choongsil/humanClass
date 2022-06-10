public class Car {
	Tire[] tires;

	public Car() {
		this.tires = new Tire[4];
		this.tires[0] = new Tire(6, "앞왼쪽");
		this.tires[1] = new Tire(2, "앞오른쪽");
		this.tires[2] = new Tire(3, "뒤왼쪽");
		this.tires[3] = new Tire(4, "뒤오른쪽");

	}

	int run() {
		System.out.println("차가 달립니다.");
		for (int i = 0; i < this.tires.length; i++) {
			if (!this.tires[i].roll()) {
				this.stop();
				return i + 1;
			}
		}
		return 0;
	}

	void stop() {
		System.out.println("차가 멈춥니다.");
	}

}
