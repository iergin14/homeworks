package chapter3;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class CarTest2 {

	public static void main(String[] args) {
		
		Car car1 = new Car();

		System.out.println("When the car stands still.");
		car1.make = "Audi";
		car1.model = "A3";
		car1.year = "2011";
		car1.distance = 30_000;
		car1.speed = 80;
		String info = car1.getInfo();
		System.out.println(info);

		System.out.println("\nWhen the car moves.");
		car1.accelerate(120);
		car1.go(400);
		car1.go(350);
		System.out.println(car1.getInfo());
		
		double goingTime = car1.go(1000);
		System.out.println("Time to go 1000 km " + goingTime + "hour.");
		System.out.println(car1.getInfo());
		
	
		System.out.println();

		Car car2 = new Car();
		car2.make = "Volswagen";
		car2.model = "Polo";
		car2.year = "2022";
		car2.distance = 0;
		car2.speed = 0;
		System.out.println(car2.getInfo());

		car2.accelerate(170);
		double timeToGo = car2.go(1000);
		System.out.println("Time to go 1000 km " + timeToGo + " hour.");
		System.out.println(car2.getInfo());
	}
}
