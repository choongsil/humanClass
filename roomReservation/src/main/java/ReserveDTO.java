
public class ReserveDTO {
	int reroomnum;
	int recnt;
	int reprice;
	int renum;
	String roomname;
	String name;
	String mobile;
	String checkin;
	String checkout;

	public ReserveDTO() {
	}

	public ReserveDTO(int reroomnum, int recnt, int reprice, int renum, String roomname, String name, String mobile,
			String checkin, String checkout) {
		this.reroomnum = reroomnum;
		this.recnt = recnt;
		this.reprice = reprice;
		this.renum = renum;
		this.roomname = roomname;
		this.name = name;
		this.mobile = mobile;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public int getRenum() {
		return renum;
	}

	public void setRenum(int renum) {
		this.renum = renum;
	}

	public String getRoomname() {
		return roomname;
	}

	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}

	public int getReroomnum() {
		return reroomnum;
	}

	public void setReroomnum(int reroomnum) {
		this.reroomnum = reroomnum;
	}

	public int getRecnt() {
		return recnt;
	}

	public void setRecnt(int recnt) {
		this.recnt = recnt;
	}

	public int getReprice() {
		return reprice;
	}

	public void setReprice(int reprice) {
		this.reprice = reprice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCheckin() {
		return checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	public String getCheckout() {
		return checkout;
	}

	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

}
