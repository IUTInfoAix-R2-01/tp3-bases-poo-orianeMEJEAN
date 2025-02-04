
public class Book_1
{
	private String name;
	private Author[] authors;
	private double price;
	private int quantite;
	
	public Book_1(String n, double p, Author[] au)
	{
		this.name = n;
		this.price = p;
		this.authors = au;
	}
	
	public Book_1(String n, double p, Author[] au, int q)
	{
		this.name = n;
		this.price = p;
		this.authors = au;
		this.quantite = q;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Author[] getAuthor()
	{
		return authors;
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
				
	}
	
	public String toString()
	{
		return "Book[name = " + name + ", authors = " + authors + ", price=" + price + ", quantity = " + quantite + "]";
	}
}
