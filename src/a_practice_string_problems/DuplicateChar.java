package a_practice_string_problems;

public class DuplicateChar 
{
public static void main(String[] args) 
{
	String s="green";
	String res="";
	for(int i=0;i<s.length();i++)
	{
		int a=0;
		char ch=s.charAt(i);
		//System.out.println(ch);
		for(int j=i+1;j<s.length();j++)
		{
			if(ch==s.charAt(j))
			{
				a++;
			}
		}
		if(a==0)
			res=res+ch;
	}
	System.out.print(res);
}
}