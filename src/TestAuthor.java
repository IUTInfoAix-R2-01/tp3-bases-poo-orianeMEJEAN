
public class TestAuthor 
{
	public static void main(String[] args) 
	{
		Author a1 = new Author ("Tan Ah Teck", "ahteck@nowhere.com", 'm'); 
		System.out.println(a1 + "\n");
		
		a1.setEmail ("paulTan@nowhere.com");
		System.out.println("name is: " + a1.getName());
		System.out.println("email is: " + a1.getEmail());
		System.out.println("gender is: " + a1.getGender() + "\n");
		
		Author a2 = new Author ("James Dashner", "jamesDashner@gmail.com", 'm');
		System.out.println(a2 + "\n");
	}
}
   