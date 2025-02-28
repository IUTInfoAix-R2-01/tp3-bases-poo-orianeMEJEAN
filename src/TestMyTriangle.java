public class TestMyTriangle
{
    public static void main(String[] args)
    {
    	MyPoint p1 = new MyPoint(0, 0);
    	MyPoint p2 = new MyPoint(5, 2);
    	MyPoint p3 = new MyPoint(1, 4);
    	MyTriangle t1 = new MyTriangle(p1, p2, p3); //Scalene

    	MyPoint p4 = new MyPoint(0, 0);
    	MyPoint p5 = new MyPoint(6, 0);
    	MyPoint p6 = new MyPoint(3, 5);
    	MyTriangle t2 = new MyTriangle(p4, p5, p6); //Equilateral marche pas....
    	
    	MyPoint p7 = new MyPoint(0, 0);
    	MyPoint p8 = new MyPoint(4, 0);
    	MyPoint p9 = new MyPoint(2, 3);
    	MyTriangle t3 = new MyTriangle(p7, p8, p9); //Isosceles

        
        System.out.println("Triangle t1: " + t1.toString());
        System.out.println("Perimeter of t1: " + t1.getPerimeter());
        System.out.println("Type of t1: " + t1.getType() + "\n");
        
        System.out.println("Triangle t2: " + t2.toString());
        System.out.println("Perimeter of t2: " + t2.getPerimeter());
        System.out.println("Type of t2: " + t2.getType() + "\n");
        System.out.println("Triangle t3: " + t3.toString());
        System.out.println("Perimeter of t3: " + t3.getPerimeter());
        System.out.println("Type of t3: " + t3.getType() + "\n");
    }
}
