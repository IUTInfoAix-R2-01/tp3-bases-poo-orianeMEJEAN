
public class Book_2
{
	private String name;
	private Author[] authors;
	private double price;
	private int quantite;
	
	public Book_2(String n, double p, Author[] au)
	{
		this.name = n;
		this.price = p;
		this.authors = au;
	}
	
	public Book_2(String n, Author[] au, double p, int q)
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
        StringBuilder authorNames = new StringBuilder();
        for (int i = 0; i < authors.length; i++) 
        {
            authorNames.append(authors[i].getName());
            if (i < authors.length - 1) 
            {
                authorNames.append(", ");
            }
        }
        return authorNames.toString();
    }
	
	public String toString()
	{
		return "Book[name = " + name + ", [authors = " + getAuthorName() + "], price = " + price + "€, quantity = " + quantite + "]";
	}
}
