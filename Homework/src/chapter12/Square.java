package chapter12;

public class Square extends Shape{
	
	private Double length;
	
	public Square() {
		// TODO Auto-generated constructor stub
	}

	@Override
	void draw() {
		System.out.println("Draw Square");
	}
	@Override
	void erase() {
		System.out.println("Draw Erase Square");
	}
	public Square(Double length) {
		this.length = length;
		
}
	@Override
	public Double calculateArea() {
		Double area = (length * length);
        return area;
	}
	@Override
	public Double calculatePerimeter() {
		Double perimeter = (length * 4);
        return perimeter;
	}
	
	@Override
	public String toString() {
		return "Square's length is : "+ length;
	}

	@Override
	public boolean equals(Object o) {
		Square p1 = (Square)o;
		boolean b = false;
		if (length.equals(p1.length))
			b = true;
		return b;
	}
	
	@Override
	public int hashCode(){
		return length.hashCode();
	}
}