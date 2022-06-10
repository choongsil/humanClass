
public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0; // 상수필드 선언

	public void turnOn();

	public void turnOff(); // 추상 메소드 선언

	public void setVolume(int volume);

	default void setMute(boolean mute) { // 디폴트 메소드 선언
		if (mute) {
			System.out.println("무음처리 합니다.");
		} else {
			System.out.println("무음해제 합니다.");
		}
	}

	static void changeBattery() { // 정적메소드 선언
		System.out.println("건전지를 교환합니다.");
	}
}
