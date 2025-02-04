
public class TestLivre
{
	public static void main (String[] args)
	{
		Livre l1 = new Livre ("Solo Leveling", 14.99, 608);
		System.out.println(l1.toString() + "\n");
		
		Livre l2 = new Livre ("Le Labyrinthe", 28, 86);
		System.out.println (l2.toString() + "\n");
		
		l1.setQuantite(20);
		System.out.println(l1 + "\n");
		
		l2.setQuantite(4);
		System.out.println(l2 + "\n");
	}
}