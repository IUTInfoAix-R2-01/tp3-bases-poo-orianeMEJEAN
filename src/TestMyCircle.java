
public class TestMyCircle
{
	public static void main (String[] args)
	{
		MyPoint p1 = new MyPoint (3, 6);
		MyPoint p2 = new MyPoint (6, 12);
		
		MyCircle c1 = new MyCircle(p1, 8);
		MyCircle c2 = new MyCircle(p2, 1);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString()+"\n");
		
		System.out.println("Center : " + c1.getCenter());
		System.out.println("Radius : " +c1.getRadius());
		System.out.println("Center : " +c2.getCenter());
		System.out.println("Radius : " +c2.getRadius() +"\n");
		
		c1.setRadius(4);
		c1.setCenter(new MyPoint(2, 2));
		System.out.println(c1);
		
		c2.setRadius(1);
		c2.setCenter(new MyPoint(5, 5));
		System.out.println(c2 +"\n");
		
		System.out.println("Area : " + c1.getArea());
		System.out.println("Circumference : " + c1.getCircumference());
		System.out.println("Area : " + c2.getArea());
		System.out.println("Circumference : " + c2.getCircumference()+"\n");
		
		double distance = c1.distance(c2);
        System.out.println("Distance between c1 and c2: " + distance);
		
	}
}