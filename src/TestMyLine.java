
public class TestMyLine
{
	public static void main (String[] args)
	{
		MyPoint p1 = new MyPoint (3, 6);
		MyPoint p2 = new MyPoint (9, 67);
		
		MyLine l1 = new MyLine (p1, p2);
		MyLine l2 = new MyLine (1, 1 , 4, 5);
		
		System.out.println(l1.toString());
		System.out.println(l2.toString()+"\n");
		
		//Getters
		System.out.println(l1.getBegin());
		System.out.println(l1.getEnd());
		System.out.println(l2.getBegin());
		System.out.println(l2.getEnd() +"\n");
		
		//Length
		System.out.println(l1.getLength());
		System.out.println(l2.getLength()+"\n");
	    
		//Gradient
		System.out.println(l1.getGradient());
		System.out.println(l2.getGradient()+"\n");
		
		//Setters
		l1.setBeginX(8);
		l1.setBeginY(10);
		System.out.println(l1);
		
		l2.setBeginX(1);
		l2.setBeginY(5);
		System.out.println(l2 +"\n");
		
		//Length with modification
		System.out.println(l1.getLength());
		System.out.println(l2.getLength());
		
	}
}