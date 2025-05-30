package inheritPack;

public class ValuePass 
{
	public static void main(String[] args) 
	{
		User a=new User(6206861440l);
		User b=new User("sam",6206861444l);
		User c=new User("alex",9102861440l,24);
		User d=new User("salman",9283735452l,25,"india");
		System.out.println("======contact loading=======");
		a.display();
		System.out.println("====name,,cont=====");
		b.display();
		System.out.println("======name,cn,age====");
		c.display();
		System.out.println("======all data======");
		d.display();
	}

}
