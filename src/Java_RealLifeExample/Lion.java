package Java_RealLifeExample;

public class Lion extends Animal
{
	static String name="LION";
	int legs;
	int tail;
	public Lion(int l,int t)
	{
		legs=l;
		tail=t;
	}
	public void animalBehave()
	{
		System.out.println("========="+name+"========");
		System.out.println(name+" has "+legs+" legs");
		System.out.println(name+" has "+tail+" tail");
	}
}
