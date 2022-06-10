
public class HomeDTO {
	String country;
	int seq;
	String Goods;

	public HomeDTO() {
	}

	public HomeDTO(String country, int seq, String goods) {
		this.country = country;
		this.seq = seq;
		Goods = goods;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getGoods() {
		return Goods;
	}

	public void setGoods(String goods) {
		Goods = goods;
	}

}
