package inheritpack2;

public class Brand 
{
	private int id;
	public Brand(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
		System.out.println("id updated...");
	}

}
