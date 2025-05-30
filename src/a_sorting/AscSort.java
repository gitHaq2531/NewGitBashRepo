package a_sorting;

public class AscSort 
{
public static void main(String[] args) 
{
	String s="a quick brown fox jumps over the lazy dog";
	int count=0;
	for (char i = 'a'; i <='z'; i++)
	{
	    for(int j=0; j<s.length(); j++)
	    {
	    	if(s.charAt(j)==i)
	    	{
	    		count++;
	    		System.out.println(i);
	    		break;
	    	}
	    }
	}
	if(count==26)
	{
		System.out.println("it is panagram");
	}
	else
		System.out.println("not panagram");
}
}