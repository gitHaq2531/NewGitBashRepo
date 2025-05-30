package qtalkassignment;

import java.util.Scanner;

public class User 
{
	public static void print()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter id: ");
		int id=s.nextInt();
		switch(id)
		{
		case 101,102,103,104,105:
			System.out.println("correct id...");
		break;
		default:
			throw new InvalidIdException(" id is invalid..");
		}
	}
	public static void main(String[] args) 
	{
		print();
	}
}
