
public class HankookTire extends Tire {

	public HankookTire() {}
	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);

	}

	@Override
	public boolean roll() {
		++accRotation;
		if (accRotation < maxRotation) {
			System.out.println(this.location + "Hankook Tire ¼ö¸í: " + (maxRotation - accRotation) + "È¸");
			return true;
		} else {
			System.out.println(this.location + "Hankook Tire ÆãÅ©");
			return false;
		}
	}
}
