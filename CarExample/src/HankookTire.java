
public class HankookTire extends Tire {

	public HankookTire() {}
	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);

	}

	@Override
	public boolean roll() {
		++accRotation;
		if (accRotation < maxRotation) {
			System.out.println(this.location + "Hankook Tire ����: " + (maxRotation - accRotation) + "ȸ");
			return true;
		} else {
			System.out.println(this.location + "Hankook Tire ��ũ");
			return false;
		}
	}
}
