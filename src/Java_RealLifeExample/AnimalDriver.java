package Java_RealLifeExample;

public class AnimalDriver 
{

public static void main(String[] args) 
{
	Lion ln=new Lion(4, 1);
	Animal an= new Animal();
	an.animalBehave();
	System.out.println("==================================");
	ln.animalBehave();
}
}
