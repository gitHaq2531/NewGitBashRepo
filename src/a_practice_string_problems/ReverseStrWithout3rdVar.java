package a_practice_string_problems;

public class ReverseStrWithout3rdVar 
{
public static void main(String[] args) 
{
	
	
	
	String str="my name is afzaul haque";
	String[] strArr=str.split(" ");
	int size=strArr.length;
	String result="";
	String first="";
	String last="";
	
	System.out.println(strArr[size-1]+" "+strArr[size-4]+" "+strArr[size-3]+" "+strArr[size-2]+" "+strArr[size-5]);

	for(int i=0;i<=strArr.length;i++) {
		if(i==0) {
			first=strArr[i];
		}
		
		else {
			System.out.println(strArr[0]);;
		}
		result=strArr[i]+" "+first;
	}
	
	
}
}
