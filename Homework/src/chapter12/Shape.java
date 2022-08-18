package chapter12;


public class Shape {
	
	private Double area;
	private Double xPos;
	private Double yPos;
	
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	
	void draw() {
		System.out.println("Draw Shape");
	}
	
	void erase() {
		System.out.println("Erase Shape");
	}
	
	public Double calculateArea() {
		return 0.0;
	}

	public Double calculatePerimeter() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public String toString() {
		return "Shape area is :" + area + " and xPos and yPos is : (" + xPos + ","+yPos + ")";
	}
	
	@Override
	public boolean equals(Object o) {
		Shape p1 = (Shape)o;
		boolean b = false;
		if (area.equals(p1.area) && xPos.equals(p1.xPos) && yPos.equals(p1.yPos))
			b = true;
		return b;
	}
	
	@Override
	public int hashCode(){
		return area.hashCode() + xPos.hashCode() +  yPos.hashCode();
	}

}
