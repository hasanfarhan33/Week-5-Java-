
public class Rectangle extends Shape implements Area {
	
	protected double a, b; 
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
		super(); 
		a = 0; 
		b = 0; 
	}

	public Rectangle(int x, int y, double width, double height) {
		super(x, y);
		this.a = width; 
		this.b = height; 
		// TODO Auto-generated constructor stub
	}
	
	

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		
		return a*b;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return (2*a) + (2*b);
	}

	@Override
	public String toString() {
		return super.toString() + "Rectangle [a=" + a + ", b=" + b + "]";
	}
	
	

}
