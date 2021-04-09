
public class Circle extends Shape {
	
	protected double radius; 

	public Circle() {
		super(); 
		radius = 0; 
		// TODO Auto-generated constructor stub
	}

	public Circle(int x, int y, double r) {
		super(x, y);
		radius = r; 
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		
		return 2*Math.PI*radius;
	}

	@Override
	public String toString() {
		return super.toString() + " Circle [radius=" + radius + "]";
	}
	
	

}
