
public class TestMyPoint
{
	public static void main (String[] args)
	{
		MyPoint p1 = new MyPoint (3, 6);
		System.out.println (p1.distance(7,13));
		
		MyPoint p2 = new MyPoint (4,9);
		System.out.println(p1.distance(p2));
		
		MyPoint p3 = new MyPoint (2, 56);
		System.out.println (p3.distance());
		
		MyPoint[] p0 = new MyPoint[10];
		for (int i = 0; i < p0.length; i++)
		{
			p0[i] = new MyPoint(i + 1, i + 1);
		}
		
		for (MyPoint point : p0)
		{
			System.out.println(point);
		}	
	}
}