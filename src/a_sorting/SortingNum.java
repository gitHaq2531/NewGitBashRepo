package a_sorting;

import java.util.TreeSet;

public class SortingNum 
{
public static void main(String[] args) {
	char a[]= {'d','f','l','a','b','m','k'};
	TreeSet<Character> n=new TreeSet<Character>();
	for(Character i:a)
	{
		n.add(i);
	}
	System.out.println(n);
	}
}
