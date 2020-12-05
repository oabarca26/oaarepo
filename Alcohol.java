public class Alcohol extends Beverage 
{
	private boolean weekend;
	private final double weekendPrice = 0.60;

	public Alcohol(String name, SIZE small, boolean weekend) 
	{
		super(name, small, TYPE.ALCOHOL);
		this.weekend = weekend;
	}
	
	public boolean isWeekend() 
	{
		return weekend;
	}
	
	public double getWeekendPrice() 
	{
		return weekendPrice;
	}
	
	public void setWeekend(boolean weekend) 
	{
		this.weekend = weekend;
	}
	
	@Override
	double calcPrice() 
	{
		double price = 0.0;
		price += super.getBasePrice();
		switch (super.getSize()) 
		{
			case SMALL:	break;
			case MEDIUM: price += super.getSizePrice();
						 break;
			case LARGE: price += 2 * super.getSizePrice();
						break;
		}
		price += this.weekend ? this.weekendPrice : 0.0;
		return price;
	}
	
	@Override
	public boolean equals(Object object) 
	{
		if (this == object)
			return true;
		if (!super.equals(object))
			return false;
		if (getClass() != object.getClass())
			return false;
		Alcohol another = (Alcohol) object;
		if (weekend != another.weekend)
			return false;
		if (Double.doubleToLongBits(weekendPrice) != Double.doubleToLongBits(another.weekendPrice))
			return false;
		return true;
	}

	@Override
	public String toString() 
	{
		return super.toString() + "\n" +
	           "Alcohol [weekend=" + weekend + ", weekendPrice=" + weekendPrice + "]" + "\n" +
				"Price =" + this.calcPrice();
	}
}