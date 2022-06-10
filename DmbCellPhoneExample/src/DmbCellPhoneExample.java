
public class DmbCellPhoneExample {

	public static void main(String[] args) {
		CellPhone phone= new DmbCellPhone("자바폰","검정",10);
//		DmbCellPhone phone = new DmbCellPhone("자바폰", "검정", 10);
//
//		System.out.println("모델="+phone.model);
//		System.out.println("색상="+phone.color);
//		
//		System.out.println("채널="+phone.channel);
//		
//		
		phone.PowerOn();
//		phone.bell();
		phone.PowerOff();
	}

}
