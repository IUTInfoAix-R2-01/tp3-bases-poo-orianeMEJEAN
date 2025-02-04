
public class Livre 
{
	private String name;
	private double price;
	private int quantite;
	
	public Livre(String name, double price, int quantite)
	{
		this.name = name;
		this.price = price;
		this.quantite = quantite;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public int getQuantite()
	{
		return quantite;
	}
	
	/*public String setName(String name)
	{
		this.name = name;   
	}
	
	public double setPrice(float price)
	{
		this.price = price;
	}
	
	public int setQuantite(int quantite)
	{
		this.quantite = quantite;
	}*/
	
	public String toString()
	{
		return "Voici les informations du livre : nom = " + name + ", prix = " + price + "€, quantité = " + quantite;
	}
	
	
}
