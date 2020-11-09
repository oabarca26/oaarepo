//Omar Abarca
//CMSC203
public class Property 
{
	private String city;
	private String owner;
	private Double rentAmount;
	private Plot plot;
	private String propertyName;
	
	public Property(String propertyName,String city,double rentAmount,String owner, int x, int y, int width, int depth ) 
	{
		this.city = city;
		this.owner = owner;
		this.propertyName = propertyName;
		this.rentAmount = rentAmount;
		this.plot = new Plot(x,y,width,depth);
	}
	public Property(String propertyName,String city,double rentAmount,String owner) 
	{
		this.city = city;
		this.owner = owner;
		this.propertyName = propertyName;
		this.rentAmount = rentAmount;
		this.plot = new Plot();
	}
	public Property() 
	{
		city = " ";
		owner = " ";
		propertyName = " ";
		rentAmount = (double) 0;
		this.plot = new Plot();
	}
	public Property(Property p) 
	{
		this.city = p.city;
		this.owner = p.owner;
		this.propertyName = p.propertyName;
		this.rentAmount = p.rentAmount;
		this.plot = new Plot(p.plot);
	}

	public String toString() 
	{
		String toString = "Property Name: " + propertyName + "\n Located in " + city + "\n Belonging to: " + owner + "\n Rent Amount: " + rentAmount;
		return toString;
	}
	public String getCity() 
	{
		return city;
	}
	public void setPropertyName(String propertyName) 
	{
		this.propertyName = propertyName;
	}
	public void setRentAmount(double rentAmount) 
	{
		this.rentAmount = rentAmount;
	}
	public double getRentAmount() 
	{
		return rentAmount;
	}
	public Plot getPlot() 
	{
		return plot;
	}
	public void setCity(String city) 
	{
		this.city = city;
	}
	public void setOwner(String owner) 
	{
		this.owner = owner;
	}
	public String getOwner() 
	{
		return owner;
	}
	public String getPropertyName() 
	{
		return propertyName;
	}
}
