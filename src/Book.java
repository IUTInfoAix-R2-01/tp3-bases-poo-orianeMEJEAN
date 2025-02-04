

public class Book 
{
	private String name;
	private Author author;
	private double price;
	private int quantite;
	
	public Book(String n, double p, Author au)
	{
		this.name = n;
		this.price = p;
		this.author = au;
	}
	
	public Book(String n, double p, Author au, int q)
	{
		this.name = n;
		this.price = p;
		this.author = au;
		this.quantite = q;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Author getAuthor()
	{
		return author;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public int getQuantite()
	{
		return quantite;
	}
	
	public void setPrice(double p)
	{
		this.price = p;
	}
	
	public void setQuantite(int quantite)
	{
		this.quantite = quantite;
	}
	
	public String getAuthorName() 
	{
		   return author.getName();
	}
	
	public String getAuthorEmail() 
	{
		   return author.getEmail();
	}
	
	public String getAuthorGender() 
	{
		   return author.getName();
	}
	
	public String toString()
	{
		return "Book [nom = " + name + ", " + author + ", prix = " + price + "€, quantité = " + quantite + "]";
	}
}
