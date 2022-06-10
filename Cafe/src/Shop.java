
public class Shop {
	Menu menu;
	Order order;
	class Sales{
		
	}

	Shop() {
		this.menu = new Menu();
		this.order = new Order();

		this.menu.build();
	}
}
