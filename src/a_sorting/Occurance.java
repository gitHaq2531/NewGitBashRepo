package a_sorting;

public class Occurance 
{
public static void main(String[] args) {
	int a[]= {2,3,3,3,4,4,5,5,2,1,2,7};
	int n=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==2)
			n++;
	}
	System.out.println(n);
}
}
