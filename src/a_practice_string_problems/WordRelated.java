package a_practice_string_problems;

public class WordRelated 
{
	public static void main(String[] args) 
	{
		String s[]= {"the","quick","brown","fox","quick"};
		int a=0;
		int b=0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i].equals("the"))
				a=i;
			else if(s[i].equals("brown"))
				b=i;
		}
		System.out.println("distance between 'the' and 'brown' is "+(b-a));
	}
}
