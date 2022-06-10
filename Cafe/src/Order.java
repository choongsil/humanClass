import java.util.ArrayList;

public class Order {
	private ArrayList<String> arMenu;
	private ArrayList<Integer> arQty;
	private ArrayList<Integer> arTotal;

	Order() {
		this.arMenu = new ArrayList<String>();
		this.arQty = new ArrayList<Integer>();
		this.arTotal = new ArrayList<Integer>();
	}

	void build() {

	}

	public void setArMenu(String str) {
		this.arMenu.add(str);
	}

	public void setArQty(int qty) {
		this.arQty.add(qty);
	}

	public void setArTotal(int total) {
		this.arTotal.add(total);
	}

	public String getArMenu(int i) {
		return this.arMenu.get(i);
	}

	public int getArQty(int i) {
		return this.arQty.get(i);
	}

	public int getArTotal(int i) {
		return this.arTotal.get(i);
	}

	public void setOrder(String str, int qty, int total) {
		this.setArMenu(str);
		this.setArQty(qty);
		this.setArTotal(total);
	}

	int display() {
		int nTotal = 0;
		for (int i = 0; i < this.arMenu.size(); i++) {
			System.out.println(this.getArMenu(i) + ",x" + this.getArQty(i) + "," + this.getArTotal(i));
			nTotal = nTotal + this.getArTotal(i);
		}
		return nTotal;
	}

}
