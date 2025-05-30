package a_practice_string_problems;

public class SZtringCount 
{
public static void main(String[] args) 
{
	int a=0;
	String s="mycountrynameisindia";
	for(int i=0;i<s.length();i++)
	{
		if(i==1 || i==8 || i==12 || i==14)
			System.out.print(s.charAt(i)+" ");
		else
			System.out.print(s.charAt(i));
	}
}
}
