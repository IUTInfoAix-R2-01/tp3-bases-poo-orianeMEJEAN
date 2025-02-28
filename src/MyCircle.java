
public class MyCircle 
{
	private MyPoint center;
	private int radius;
	
	public MyCircle()
	{
		this.center = new MyPoint(0, 0);
		this.radius = 1;
	}
	
	public MyCircle(int x, int y, int r)
	{
		this.center = new MyPoint(x, y);
		this.radius = r;
	}
	
	public MyCircle(MyPoint c, int r)
	{
		this.center = c;
		this.radius = r;
	}
	
	public int getRadius()
	{
		return radius;
	}
	
	public void setRadius(int r)
	{
		this.radius = r;
	}
	
	public MyPoint getCenter()
	{
		return center;
	}
	
	public void setCenter(MyPoint c)
	{
		this.center = c;
	}
	
	public int getCenterX()
	{
		return center.getX();
	}
	
	public void setCenterX(int x)
	{
		this.center.setX(x);
	}
	
	public int getCenterY()
	{
		return center.getY();
	}
	
	public void setCenterY(int y)
	{
		this.center.setY(y);
	}
	
	public String toString()
	{
		return "MyCircle [radius = " + radius + ", center = " + center.toString()+ "]";
	}
	
	public double getArea()
	{
		return Math.PI * radius * radius;
	}
	
	public double getCircumference()
	{
		return 2 * Math.PI * radius;
	}
	
	public double distance(MyCircle another)
	{
		return this.center.distance(another.center);
	}
}
