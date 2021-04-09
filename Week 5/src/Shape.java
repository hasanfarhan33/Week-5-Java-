
public abstract class Shape {

	public static int shapeCount = 0; 
	protected int x; 
	protected int y; 
	
	public Shape()
	{
		this.x = 0; 
		this.y = 0; 
		shapeCount++; 
	}

	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		shapeCount++; 
	}

	public static int getShapeCount() {
		return shapeCount;
	}

	public static void setShapeCount(int shapeCount) {
		Shape.shapeCount = shapeCount;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public abstract double calculatePerimeter();

	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
	
	
}
