//Write a Java program. enter some characters and try to find ascii value of them.  
//Write some characters and. try to get output in reverse order.  


package ArrayTest;

public class AsciiV 
{
	public static void main(String[] args) 
	{
		char ch[]= {'A','B','C','D'};
		for(int i=0;i<ch.length;i++)
		{
			int a=ch[i];
			System.out.println(a);
		}
		check();
	}
	public static void  check()
	{
		char x[]=new char[6];
		x[0]='a';
		x[1]='f';
		x[2]='z';
		x[3]='a';
		x[4]='u';
		x[5]='l';
		System.out.println("string reverse order");
		for(int n=x.length-1;n>=0;n--)
		{
			char y=x[n];
		System.out.print(y);
		}
		System.out.println();
		System.out.println("reverse,,.....");
		char ch[]= {'a','b','c','d'};
		for(int i=ch.length-1;i>=0;i--)
		{
		int z=ch[i];
		System.out.println(z);
		}
	}
}
