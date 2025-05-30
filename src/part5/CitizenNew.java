package part5;

public class CitizenNew 
{
	private int pincode;
	private long adharid;
	public CitizenNew(int pincode,long adharid)
	{
		this.pincode=pincode;
		this.adharid=adharid;
	}
	public long getAdharid()
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
		System.out.println("pincode updated..");
	}
}
