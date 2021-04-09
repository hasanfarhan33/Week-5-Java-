
public class Source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Circle(20, 20, 5);
		System.out.println(s);
		System.out.println("S in perimeter " + s.calculatePerimeter());
		System.out.println("Shape count = " + s.shapeCount);
		s.setShapeCount(7);
		
		Shape s1 = new Rectangle(30, 30, 10, 5);
		System.out.println(s1);
		System.out.println("S1 Area = " + ((Rectangle)s1).calculateArea()); 
		System.out.println("S1 Perimeter = " + s1.calculatePerimeter());
		System.out.println("Shape Count = " + Shape.shapeCount);
		System.out.println("Shape Count = " + s1.shapeCount);
		
		Rectangle r = new Rectangle(30, 30, 10, 10); 
		System.out.println("R Area = " + r.calculateArea());
		
		if(r instanceof Shape)
		{
			Shape s3 = (Shape)r; 
			System.out.println(s3);
			System.out.println("S3 Perimeter = " + s3.calculatePerimeter());
		}
		
//		Circle c = (Circle)r; Error 
		Circle c = new Circle(10, 10, 5); 
		if(c instanceof Shape)
		{
			Shape s2 = (Shape)c; 
			System.out.println(s2);
			System.out.println("S2 Perimeter = " + s2.calculatePerimeter());
		}
		else
		{
			System.err.println("Error"); 
		}
		
		Shape shapes[] = new Shape[10]; 
		Shape.setShapeCount(0);
		
		for(int i = 0; i < shapes.length; i++)
		{
			shapes[i] = ShapeCreator.create(); 
		}
		
		double totalPerimeter = 0; 
		int countRectangle = 0; 
		double totalRectPerimeter = 0;
		
		for(Shape sh : shapes)
		{
			if(sh instanceof Rectangle)
			{
				Rectangle t = (Rectangle) sh; 
				countRectangle++; 
			}
			totalPerimeter += sh.calculatePerimeter(); 
		}
		
		System.out.println("# of Rectangles = " + countRectangle);
		System.out.println("Average Perimeter = " + totalPerimeter / Shape.getShapeCount());
		System.out.println("Average Rectangle Perimeter = " + totalRectPerimeter / countRectangle);
		
		
		
		

	}

}
