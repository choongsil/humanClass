
public class StudentExample {

	public static void main(String[] args) {
	Car seltos=new Car();
	seltos.max_speed=220;
	seltos.person=5;
	seltos.speed=0;
	seltos.model="Novelise 1.6 GTI 2WD";
	seltos.company="Kia";
	System.out.println("seltos speed="+seltos.speed);
	seltos.run(60);
	System.out.println("seltos speed="+seltos.speed);
	seltos.fuel=10;
	System.out.println("seltos fuel="+seltos.fuel);
	seltos.refueling(70);
	System.out.println("seltos fuel="+seltos.fuel);
	seltos.stop();
	System.out.println("seltos speed="+seltos.speed);
	}

}
