package a_String;

import java.util.ArrayList;
import java.util.HashSet;

public class CountChar 
{
public static void main(String[] args) {
	String s="aaabbcacc";
	HashSet hs=new HashSet();
	for(int i=0;i<s.length();i++)
	{
		hs.add(s.charAt(i));
	}
	ArrayList al=new ArrayList(hs);
	for(int i=0;i<al.size();i++)
	{
		int count=0;
		for(int j=0;j<s.length();j++)
		{
			if(al.get(i).equals(s.charAt(j)))
			{
				count++;
			}
		}
		System.out.print(al.get(i)+""+count);
	}
}
}
