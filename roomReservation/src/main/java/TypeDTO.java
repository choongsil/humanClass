
public class TypeDTO {
	int Type_id;
	String Type_name;

	public TypeDTO() {
	}

	public TypeDTO(int type_id, String type_name) {
		Type_id = type_id;
		Type_name = type_name;
	}

	public int getType_id() {
		return Type_id;
	}

	public void setType_id(int type_id) {
		Type_id = type_id;
	}

	public String getType_name() {
		return Type_name;
	}

	public void setType_name(String type_name) {
		Type_name = type_name;
	}

}
