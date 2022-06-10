import java.util.ArrayList;

public class Sales {
	private ArrayList<String> arMobile;
	private ArrayList<Integer> arSum;

	Sales() {
		this.arMobile = new ArrayList<String>();
		this.arSum = new ArrayList<Integer>();
	}

	public void setAll(String mobile, int sum) {
		if (mobile.equals("")) {
			mobile = "---------";
		}
		this.arMobile.add(mobile);
		this.arSum.add(sum);
		System.out.println("����Ϲ�ȣ :" + mobile + "���� :" + sum + "��");
	}

	public int getArSum(int i) {
		return this.arSum.get(i);
	}

	public String getArMobile(int i) {
		return this.arMobile.get(i);
	}

	int display() {
		int erp = 0;
		for (int i = 0; i < this.arMobile.size(); i++) {
			System.out.println(this.getArMobile(i) + ":" + this.getArSum(i));
			erp = erp + this.getArSum(i);
		}
		System.out.println("�Ѹ��� : " + erp + "��");
		return erp;
	}
}
