
public class DmbCellPhone extends CellPhone {
	int channel;
	

	public DmbCellPhone(String _model, String _color, int channel) {
		super(_model,_color);
		this.channel = channel;
		
	}

	void PowerOn() {
		System.out.println("ä��" + this.channel + "�� DMB��� ������ �����մϴ�.");
	
	}

	void PowerOff() {
		System.out.println("ä��"+this.channel+"�� DMB��� ������ ����ϴ�.");
	}

	void changeChannel(int _channel){
		this.channel=_channel;
		System.out.println("ä��"+this.channel+"������ �ٲߴϴ�.");
	}
	
}
