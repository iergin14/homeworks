package chapter12;


public class Rectangle extends Shape{
	private Double width;
    private Double length1;

    public Rectangle(Double width, Double length) {
      
    	this.width = width;
        this.length1 = length;
    }

    @Override
    public Double calculateArea() {
    	Double area = width * length1;
        return area;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length1;
    }
    public void setLength(Double length) {
        this.length1 = length;
    }
    
	@Override
	void draw() {
		System.out.println("Draw Rectangle");
	}
	@Override
	void erase() {
		System.out.println("Draw Erase Rectangle");
	
	}
	@Override
	public Double calculatePerimeter() {
		Double perimeter = ((width+length1)*2);
        return perimeter;
	}
	
	@Override
	public String toString() {
		return "Rectangle's width is :" + width + " and length is: " + length1;
	}
	
	@Override
	public boolean equals(Object o) {
		Rectangle p1 = (Rectangle)o;
		System.out.println(p1.getWidth());
		System.out.println(width);
		System.out.println(p1.getLength());
		System.out.println(this.width.equals(p1.getWidth()) );
		if (this.width.equals(p1.getWidth()) && this.length1.equals(p1.length1)) {
			return true;
		}
			return false;
	}
	
	@Override
	public int hashCode(){
		return length1.hashCode() + width.hashCode() ;
	}
}
