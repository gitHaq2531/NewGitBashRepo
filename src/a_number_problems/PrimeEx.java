package a_number_problems;

public class PrimeEx 
{
public static void main(String[] args) 
{
	int a=6;
	int n=0;
	for(int i=2;i<a;i++) {
		if(a%i==0) {
			n++;
		}
	}
	if(n==1) {
		System.out.println(a+" is not prime");
	}
	else {
		System.out.println(a+" prime");
	}
}
}
