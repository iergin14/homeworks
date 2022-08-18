package chapter12;


public class Circle extends Shape {

	private Integer radius;
	
	@Override
	void draw() {
		System.out.println("Draw Circle");
	}
	@Override
	void erase() {
		System.out.println("Draw Erase Circle");
	}
	
	public Circle(Integer radius) {
		 this.radius = radius;
	}
	
	public Integer getRadius() {
		return radius;
	}
	
	@Override
	public Double calculateArea() {
		return Math.PI * (radius * radius);
	}
	@Override
	public Double calculatePerimeter() {
		return 2*Math.PI *radius;
	}
	
	@Override
	public String toString() {
		return "Circle radius is : "+ radius;
	}

	@Override
	public boolean equals(Object o) {
		Circle p1 = (Circle)o;
		boolean b = false;
		if (radius.equals(p1.radius))
			b = true;
		return b;
	}
	
	public int hashCode(){
		return radius ;
	}
}
