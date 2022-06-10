
public class Car {
	String color;
	String modelName;
	String model;
	String company;
	int max_speed;
	int speed;
	int person;
	int fuel;
	int max_fuel;

	public Car() {
	}

	public Car(String color, String modelName, String model, String company, int max_speed, int speed, int person,
			int fuel, int max_fuel) {
		this.color = color;
		this.modelName = modelName;
		this.model = model;
		this.company = company;
		this.max_speed = max_speed;
		this.speed = speed;
		this.person = person;
		this.fuel = fuel;
		this.max_fuel = max_fuel;
	}

	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getMax_speed() {
		return max_speed;
	}

	public void setMax_speed(int max_speed) {
		this.max_speed = max_speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getPerson() {
		return person;
	}

	public void setPerson(int person) {
		this.person = person;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	public int getMax_fuel() {
		return max_fuel;
	}

	public void setMax_fuel(int max_fuel) {
		this.max_fuel = max_fuel;
	}

	void run(int n) {
		this.speed = n;
	}

	void stop() {
		this.speed = 0;
	}

	void turn_left() {

	}

	void turn_right() {

	}

	void refueling(int x) {
		this.fuel = this.fuel + x;

	}
}
