public class Circle extends Shape
{
	public double getArea()
	{
		return Math.PI * radius * radius;
	}
	public double getCircumference()
	{
		return 2 * Math.PI * radius;
	}
	public void move(double disp_x, double disp_y)
	{
		x += disp_x;
		y += disp_y;
	}
	public String toString()
	{
		return "Circle[(" + x + ", " + y + "): " + radius + "]";
	}
	
	public Circle(double x_, double y_, double radius_)
	{
		x = x_;
		y = y_;
		radius = radius_;
	}

	private double x;
	private double y;
	private double radius;
}
