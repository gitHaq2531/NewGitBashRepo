package part4;

public class Citizen 
{
private int pincode;
private long adharid;
public Citizen(int pincode,long adharid)
{
	this.pincode=pincode;
	this.adharid=adharid;
}
public long getAdhard() 
{
	return adharid;
}
public int getPincode()
{
	return pincode;
}
public void setPincode(int pincode)
{
	this.pincode=pincode;
	System.out.println("pincode updated...");
}

}
