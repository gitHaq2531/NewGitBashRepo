package a_number_problems;

public class DuplicateDgt 
{
public static void main(String[] args) {
	int n=12343546;
	int num[]=new int[7];
	for(int i=0;i<num.length;i++) {
		int rem=n%10;
		num[i]=rem;
		n=n/10;
	}
	for(int i=0;i<num.length;i++) {
		for(int j=i+1;j<num.length;j++) {
			if(num[i]==num[j])
				System.out.println(num[i]+" ");
		}
	}
}
}
