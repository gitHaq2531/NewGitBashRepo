package a_new_programs;

public class CountDuplicate 
{
public static void main(String[] args) 
{
	String s="abcabbacd";
	{
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			boolean flag=false;
			char ch=s.charAt(i);
			for(int j=0;j<s.length();j++)
			{
				if(ch==s.charAt(j) && j<i)
				{
					flag=true;
					break;
				}
				if(ch==s.charAt(j))
				{
					count++;
				}
			}
			if(flag==false)
			{
			System.out.print(ch+""+count);
			}
		}
	}
}
}
