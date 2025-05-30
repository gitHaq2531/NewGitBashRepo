package part2;

public class Pen {
 String brand;
public Pen(String brand)
{
	this.brand=brand;
}
public static void main(String[] args) {
	Pen p=new Pen("CELLO");
	System.out.println(p.brand);
}
}
