
public class RoomManagementDTO {
	int RoomNumber;
	String RoomType;
	String RoomName;
	int room_type;
	int min;
	int price;

	public RoomManagementDTO() {
	}

	public RoomManagementDTO(int roomNumber, String roomType, String roomName, int room_type, int min, int price) {
		RoomNumber = roomNumber;
		RoomType = roomType;
		RoomName = roomName;
		this.room_type = room_type;
		this.min = min;
		this.price = price;
	}

	

	public int getRoom_type() {
		return room_type;
	}

	public void setRoom_type(int room_type) {
		this.room_type = room_type;
	}

	public int getRoomNumber() {
		return RoomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		RoomNumber = roomNumber;
	}

	public String getRoomType() {
		return RoomType;
	}

	public void setRoomType(String roomType) {
		RoomType = roomType;
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
