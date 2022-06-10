
public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl tv = new Television();

		tv.turnOn();
		tv.setVolume(7);
		tv.turnOff();
		tv.setMute(true);
		RemoteControl.changeBattery();
		System.out.println("---------------------");

		RemoteControl audio = new Audio();
		audio.turnOn();
		audio.setVolume(5);
		audio.setMute(true);
		audio.turnOff();
		RemoteControl.changeBattery();

	}

}
