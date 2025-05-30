package qtalkassignment;

public class StringBased 
{
	public static void main(String[] args) 
	{
		
		String s="abc1dAB@2";
		String low=" ";
		String num=" ";
		String cap=" ";
		String spc=" ";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				low=low+s.charAt(i);
			}
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				cap=cap+s.charAt(i);
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num=num+s.charAt(i);
			}
			else
			{
				spc=spc+s.charAt(i);
			}
		}
		System.out.println(low);
		System.out.println(num);
		System.out.println(spc);
		System.out.println(cap);
		
	}
}
