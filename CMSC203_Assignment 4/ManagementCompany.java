//Omar Abarca
//CMSC203
public class ManagementCompany 
{
	private int MAX_PROPERTY = 5;
	private int MGMT_WIDTH = 10;
	private int MGMT_DEPTH = 10;
	private String name;
	private String taxID;
	private double mgmFeePer;
	private Plot plot;
	private Property[] properties;

	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) 
	{
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;
		this.plot = new Plot(x,y,width,depth);
		this.properties = new Property[MAX_PROPERTY];
	}
	public ManagementCompany(ManagementCompany otherCompany) 
	{
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		this.mgmFeePer = otherCompany.mgmFeePer;
		this.plot = otherCompany.plot;
		this.properties = otherCompany.properties;
	}
	public ManagementCompany(String name, String taxID, double mgmFee) 
	{
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;
		this.plot = new Plot(0,0,10,10);
		this.properties = new Property[MAX_PROPERTY];
	}
	
	public ManagementCompany() 
	{
		this.name = "";
		this.taxID = "";
		this.plot = new Plot(0,0,10,10);
		this.properties = new Property[MAX_PROPERTY];
	}
	public int getMAX_PROPERTY() 
	{
		return MAX_PROPERTY;
	}
	
	public int addProperty(String name, String city, double rent, String owner, int x,int y,int width,int depth ) 
	{
		Property addedProperty = new Property(name,city,rent,owner,x,y,width,depth);
		Plot addedPlot = new Plot(x,y,width,depth);
		int verify = 0;
		for (int a = 0; a <= MAX_PROPERTY; a++)
		{
			if(a==MAX_PROPERTY) 
			{
				verify = -1;
			} 
			else if (name == null && city == null && rent == 0 && owner == null && x == 0 && y ==0 && width == 0 && depth == 0) 
			{
				verify = -2;
			} 
			else if (addedPlot.encompasses(addedProperty.getPlot())) 
			{
				verify = -3;
			} 
			else if (addedPlot.overlaps(addedProperty.getPlot())) 
			{
				verify = -4;
			} 
			else 
			{
				properties[a] = addedProperty;
				verify = a;
			}
		}
		return verify;
	}
	public int addProperty(Property property) 
	{
		int verify = 0;
		Property addedProperty = new Property(property);
		Plot addedPlot = new Plot(plot);
		for (int a = 0; a <MAX_PROPERTY; a++) 
		{
			properties[a] = property;
			if (a >= MAX_PROPERTY) 
			{
				verify = -1;
			} 
			else if (property == null) 
			{
				verify = -2;
			} 
			else if (addedPlot.encompasses(addedProperty.getPlot())) 
			{
				verify = -3;
			} 
			else if(addedPlot.overlaps(addedProperty.getPlot())) 
			{
				verify = -4;
			} 
			else 
			{
				properties[a] = addedProperty;
				verify = a;
			}
		}
		return verify;
	}
	public double totalRent() 
	{
		double totalRent=0.0;
		for (int i = 0;  i < properties.length; i++) 
		{
			totalRent += properties[i].getRentAmount();
		}
		return totalRent;
	}
	public int maxRentPropertyIndex() 
	{
		int index = -1;
	    double max = 0;
	    for (int i = 0;i<properties.length;i++) {
	      if (properties[i]==null) {
	        break;
	      }
	      if (properties[i].getRentAmount() > max) {
	        max = properties[i].getRentAmount();
	        index = i;
	      }
	    }
	    return index;
	}
	public double maxRentProp() 
	{
		double maxRent = properties[0].getRentAmount();
		for (int i = 0; i < properties.length; i++) 
		{
			if(maxRent > properties[i].getRentAmount()) 
			{
				maxRent = properties[i].getRentAmount();
			}
		}
		return maxRent;
	}
	
	public Plot getPlot() 
	{
		return plot;
	}
	public String displayPropertyAtIndex(int i) 
	{
		String display = "Owner: " + properties[i].getOwner() + "\n City: " + properties[i].getCity() +
						"\n Property Name: " + properties[i].getPropertyName() +
						"\n Rent Amount: " + properties[i].getRentAmount();
		return display;
	}
	public String getName() 
	{
		return name;
	}
	public String toString() 
	{
		String toString = "";
		for (int i = 0; i < properties.length; i++) 
		{
			String propertyName = properties[i].getPropertyName();
			String location = properties[i].getCity();
			String owner = properties[i].getOwner();
			double rent = properties[i].getRentAmount();
			toString += "List of the properties for " + name + ", taxID: " + taxID + "\n" + "Property Name: " 
			+ propertyName + "\n  Located in: " + location + "\n  Belonging to: " + owner +
			"\n  Rent Amount: " + rent;	
		}
		return toString;
	}
}
