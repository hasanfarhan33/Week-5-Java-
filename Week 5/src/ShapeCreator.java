import java.util.Random; 
public class ShapeCreator {
	
	public static Shape create() 
	{
		Shape s = null; 
		int x; 
		int y; 
		
		Random rand = new Random(); 
		int ch = rand.nextInt(2) + 1; 
		
		switch(ch)
		{
		case 1:
			x = rand.nextInt(100); 
			y = rand.nextInt(100); 
			double rad = rand.nextDouble() * 10; 
			s = new Circle(x, y, rad); 
			break; 
		case 2:
			x = rand.nextInt(100); 
			y = rand.nextInt(100);
			double a = rand.nextDouble() * 10;
			double b = rand.nextDouble() * 10;
			s = new Rectangle(x, y, a, b);
		default:
			break;
			
			
			
		}
		
		return s; 
	}

}
