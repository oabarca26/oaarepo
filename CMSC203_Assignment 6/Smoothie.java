public class Smoothie extends Beverage 
{
	private final double proteinPrice = 1.50;
	private final double fruitPrice = 0.50;
	private int numFruits;
	private boolean protienAdded;

	public Smoothie(String name, SIZE size, int fruits, boolean protein) 
	{
		super(name, size, TYPE.SMOOTHIE);
		this.numFruits = fruits;
		this.protienAdded = protein;
	}
	
	public int getNumOfFruits() 
	{
		return numFruits;
	}
	
	public double getProteinPrice() 
	{
		return proteinPrice;
	}

	public double getFruitPrice() 
	{
		return fruitPrice;
	}
	
	public boolean getAddProtien() 
	{
		return protienAdded;
	}
	
	public void setNumFruits(int fruits) 
	{
		this.numFruits = fruits;
	}

	public void setAddProtien(boolean protein) 
	{
		this.protienAdded = protein;
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
		price += this.protienAdded ? this.proteinPrice : 0.0;
		price += this.numFruits * this.fruitPrice;
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
		Smoothie another = (Smoothie) object;
		if (Double.doubleToLongBits(fruitPrice) != Double.doubleToLongBits(another.fruitPrice))
			return false;
		if (numFruits != another.numFruits)
			return false;
		if (protienAdded != another.protienAdded)
			return false;
		if (Double.doubleToLongBits(proteinPrice) != Double.doubleToLongBits(another.proteinPrice))
			return false;
		return true;
	}
	
	@Override
	public String toString() 
	{
		return super.toString() + "\n" +
	           "Smoothie [fruits=" + numFruits + ", protein=" + protienAdded + "]" + "\n" +
				"Price =" + this.calcPrice();
	}
}
