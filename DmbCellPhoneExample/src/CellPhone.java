
public class CellPhone {
 String model;
 String color;
 
 public CellPhone() {
	 this.model="samsung";
	 this.color="silver";
 }
 
 public CellPhone(String model, String color) {
	this.model = model;
	this.color = color;
}
void PowerOn() {
	 System.out.println("������ �մϴ�.");
 }
 void PowerOff() {
	 System.out.println("������ ���ϴ�.");
 }
 void bell() {
	 System.out.println("���� �︳�ϴ�.");
 }
 void sendVoice(String message) {
	 System.out.println("�ڱ�:"+message);
 }
 void receiveVoice(String message) {
	 System.out.println("����:"+message);
 }
 void hangUp() {
	 System.out.println("��ȭ�� �����ϴ�.");
 }
}
