
public class Tire {
	int maxRotation;// 타이어수명(회전수)
	int accRotation; // 현재까지 회전수
	String location; // 타이어의 장착 위치

	public Tire() {}
	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
		this.accRotation = 0;
	}

	public boolean roll() {
		++accRotation;
		if (accRotation < maxRotation) {
			System.out.println(this.location + "Tire 수명: " + (maxRotation - accRotation) + "회");
			return true;
		} else {
			System.out.println(this.location + "Tire 펑크");
			return false;
		}
	}

}
