
public class IncomeDTO {
	String mobile;
	String date;
	int seqno;
	int qty;
	int price;
	String menuname;

	
	public IncomeDTO() {
	}


	public IncomeDTO(String mobile, String date, int seqno, int qty, int price, String menuname) {
		this.mobile = mobile;
		this.date = date;
		this.seqno = seqno;
		this.qty = qty;
		this.price = price;
		this.menuname = menuname;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public int getSeqno() {
		return seqno;
	}


	public void setSeqno(int seqno) {
		this.seqno = seqno;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getMenuname() {
		return menuname;
	}


	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}


	

}