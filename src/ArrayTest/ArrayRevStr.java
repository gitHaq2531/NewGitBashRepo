package ArrayTest;

public class ArrayRevStr 
{
	public static void main(String[]args)
	{
		check();
	}
	public static void check()
	{
		String s[]=new String[5];
		String s1[]=new String[s.length];
		s[0]="afzaul";
		s[1]="arbaz";
		s[2]="bhashwat";
		s[3]="ranjeeth";
		s[4]="saif";
		for(int i=s.length-1;i>=0;i--)
		{
			s1[s.length-1-i]=s[i];
		//System.out.println(s[i]);
		}
		for(int i=0;i<s.length;i++)
		{
		System.out.println(s1[i]);
		}
	}
}
