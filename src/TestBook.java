
public class TestBook
{
	public static void main (String[] args)
	{
		Author a1 = new Author ("Tan Ah Teck", "ahteck@nowhere.com", 'm');
		System.out.println(a1 + "\n");

		Book d1 = new Book ("Java for dummy", 19.95, a1, 99);
		System.out.println(d1 + "\n");

		d1.setPrice (29.95);
		d1.setQuantite (28);
		System.out.println("name is: " + d1.getName());
		System.out.println("price is: " + d1.getPrice());
		System.out.println("quantity is: " + d1.getQuantite() + "\n");
		System.out.println("Author is: " + d1.getAuthor());
		System.out.println("Author's name is: " + d1.getAuthor().getName());
		System.out.println("Author's email is: " + d1.getAuthor().getEmail() + "\n");

		Book otherBook = new Book("more Java", 29.95, new Author("Paul Tan", "paul@somewhere.com", 'm'));
		System.out.println(otherBook + "\n");
		
		
		Book aBook = new Book ("Le Labyrinthe", 28, new Author ("James Dashne", "jamesDashner@gmail.com", 'm'), 86);
		System.out.println(aBook);
		System.out.println("Author's name = " + aBook.getAuthor().getName());
		System.out.println("Author's email = " + aBook.getAuthor().getEmail());
		
		
		
		
	}
}