
public class menuDTO {
	private String menuName;
	private int menuPrice;
	private int sqNum;

	public menuDTO() {
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public int getMenuPrice() {
		return menuPrice;
	}

	public void setMenuPrice(int menuPrice) {
		this.menuPrice = menuPrice;
	}

	public int getSqNum() {
		return sqNum;
	}

	public void setSqNum(int sqNum) {
		this.sqNum = sqNum;
	}

	public menuDTO(int sqNum, String menuName, int menuPrice) {
		this.sqNum=sqNum;
		this.menuName = menuName;
		this.menuPrice = menuPrice;
	}
}
