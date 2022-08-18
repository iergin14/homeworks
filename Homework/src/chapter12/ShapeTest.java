package chapter12;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Rectangle temp = new Rectangle(5.0, 3.5);
		Double tempArea = temp.calculateArea();
	
		Rectangle temp2 = new Rectangle(5.0, 3.5);
		Double temp2Area = temp2.calculateArea();
		System.out.println("temp and temp1 are same rectangjojoji");
			
		System.out.println(temp.equals(temp2));
		
		Circle cir = new Circle(5);
		System.out.println("Circle toString is :" +cir.toString());

}
}
