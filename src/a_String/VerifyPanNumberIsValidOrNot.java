package a_String;

public class VerifyPanNumberIsValidOrNot 
{
public static void main(String[] args) 
{
	String panNo="AZTPH3864K";
	if(panNo.matches("[A-Z]{5}[1-9]{4}[A-Z]{1}"))
	{
		System.out.println("valid pan card");
	}
	else
	{
		System.out.println("invalid pan card");
	}
}
}
