
public class TestBook2
{
	public static void main (String[] args)
	{
		Author[] authors = new Author[2];
		authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
		authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

		Book_2 d1 = new Book_2("Java for Dummy",  authors, 19.99, 99);
		System.out.println(d1.toString());

		/*d1.setPrice (29.95);
		d1.setQuantite (28);
		System.out.println("name is: " + d1.getName());
		System.out.println("price is: " + d1.getPrice());
		System.out.println("quantity is: " + d1.getQuantite() + "\n");
		System.out.println("Author is: " + d1.getAuthor());
		System.out.println("Author's name is: " + d1.getAuthor().getName());
		System.out.println("Author's email is: " + d1.getAuthor().getEmail() + "\n");*/
		
	}
}