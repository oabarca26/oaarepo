public class Coffee extends Beverage 
{
	private final double shotPrice = 0.50;
	private final double syrupPrice = 0.50;
	private boolean extraShot;
	private boolean extraSyrup;

	public Coffee(String name, SIZE size, boolean shots, boolean syrup) 
	{
		super(name, size, TYPE.COFFEE);
		this.extraShot = shots;
		this.extraSyrup = syrup;
	}
	
	public boolean getExtraSyrup() 
	{
		return extraSyrup;
	}

	public void setExtraSyrup(boolean extraSyrup) 
	{
		this.extraSyrup = extraSyrup;
	}
	
	public double getShotPrice() 
	{
		return shotPrice;
	}

	public double getSyrupPrice() 
	{
		return syrupPrice;
	}
	
	public boolean getExtraShot() 
	{
		return extraShot;
	}

	public void setExtraShot(boolean extraShot) 
	{
		this.extraShot = extraShot;
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
		Coffee another = (Coffee) object;
		if (extraShot != another.extraShot)
			return false;
		if (extraSyrup != another.extraSyrup)
			return false;
		return true;
	}
	
	@Override
	double calcPrice() 
	{
		double price = 0.0;
		price += super.getBasePrice();
		switch (super.getSize()) 
		{
			case SMALL: break;
			case MEDIUM: price += super.getSizePrice();
						 break;
			case LARGE: price += 2 * super.getSizePrice();
						break;
		}
		price += this.extraShot ? this.shotPrice : 0.0;
		price += this.extraSyrup ? this.syrupPrice : 0.0;
		return price;
	}

	@Override
	public String toString() 
	{
		return super.toString() + "\n" +
			   "Coffee [extraShot=" + extraShot + ", extraSyrup=" + extraSyrup + "]" + "\n" +
			   "Price =" + this.calcPrice();
	}
}