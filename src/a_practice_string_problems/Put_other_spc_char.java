package a_practice_string_problems;

public class Put_other_spc_char 
{
public static void main(String[] args) 
{
	String s="my name is afzaul";
	String res[]=s.split(" ");
	for(int i=0;i<res.length;i++)
	{
		if(i!=res.length-1)
		System.out.print(res[i]+'-');
		else
			System.out.println(res[i]);
	}
}
}
