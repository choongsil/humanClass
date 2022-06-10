
public class ReservationDTO {
	String typename;
	String RoomName;
	String checkin;
	String checkout;
	String name;
	String mobile;
	int renum;
	int recnt;
	int Roomnum;
	int min;
	int price;

	public ReservationDTO() {
	}

	public ReservationDTO(String typename, String roomName, String checkin, String checkout, String name, String mobile,
			int renum, int recnt, int roomnum, int min, int price) {
		this.typename = typename;
		RoomName = roomName;
		this.checkin = checkin;
		this.checkout = checkout;
		this.name = name;
		this.mobile = mobile;
		this.renum = renum;
		this.recnt = recnt;
		Roomnum = roomnum;
		this.min = min;
		this.price = price;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getRenum() {
		return renum;
	}

	public void setRenum(int renum) {
		this.renum = renum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getRecnt() {
		return recnt;
	}

	public void setRecnt(int recnt) {
		this.recnt = recnt;
	}

	public int getRoomnum() {
		return Roomnum;
	}

	public void setRoomnum(int roomnum) {
		Roomnum = roomnum;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public String getRoomName() {
		return RoomName;
	}

	public void setRoomName(String roomName) {
		RoomName = roomName;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
