
public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0; // ����ʵ� ����

	public void turnOn();

	public void turnOff(); // �߻� �޼ҵ� ����

	public void setVolume(int volume);

	default void setMute(boolean mute) { // ����Ʈ �޼ҵ� ����
		if (mute) {
			System.out.println("����ó�� �մϴ�.");
		} else {
			System.out.println("�������� �մϴ�.");
		}
	}

	static void changeBattery() { // �����޼ҵ� ����
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
