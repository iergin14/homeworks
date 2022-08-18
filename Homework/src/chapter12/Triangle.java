package chapter12;


public class Triangle extends Shape{
	private Double side1;
	private Double side2;
	private Double side3;

	@Override
	void draw() {
		System.out.println("Draw Triangle");
	}
	@Override
	void erase() {
		System.out.println("Draw Erase Triangle");
	}

	public Triangle(Double side1, Double side2, Double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	@Override
	public Double calculateArea() {
		Double u = (side1 + side2 + side3) / 2;
        Double area = Math.sqrt(u * (u - side1) * (u - side2) * (u - side3));
        return area;
	}
	@Override
	public Double calculatePerimeter() {
		Double perimeter = (side1 + side2 + side3);
        return perimeter;
	}
	
	@Override
	public String toString() {
		return "Triangle's side1 is: " + side1 + "side2 is: " + side2 + "side3 is: " + side3 ;
	}

	@Override
	public boolean equals(Object o) {
		Triangle p1 = (Triangle)o;
		boolean b = false;
		if (side1.equals(p1.side1) && side2.equals(p1.side2) && side3.equals(p1.side3))
			b = true;
		return b;
	}
	
	@Override
	public int hashCode(){
		return side1.hashCode() + side2.hashCode()  + side3.hashCode() ;
	}
}
