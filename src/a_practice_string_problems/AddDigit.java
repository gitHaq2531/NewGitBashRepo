package a_practice_string_problems;

public class AddDigit 
{
public static void main(String[] args) 
{
	String s="abcd1234";
	int sum=0;
	String num="";
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch>='0' && ch<='9')
		{
			sum=sum+(ch-48);
			num=num+ch;
		}
	}
	System.out.println(sum);
	System.out.println(num);
}
}
