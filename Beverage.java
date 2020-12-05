public abstract class Beverage 
{
	private final double basePrice = 2.00;
	private final double sizePrice = 1.00;
	private TYPE type;
	private SIZE size;
	private String beverageName;

	public Beverage(String name, SIZE size, TYPE type) 
	{
		this.beverageName = name;
		this.size = size;
		this.type = type;
	}
	
	public TYPE getType() 
	{
		return type;
	}

	public void setType(TYPE type) 
	{
		this.type = type;
	}
	
	public String getBevName() 
	{
		return beverageName;
	}

	public void setBevName(String name) 
	{
		this.beverageName = name;
	}

	public double getBasePrice() 
	{
		return basePrice;
	}

	public double getSizePrice() 
	{
		return sizePrice;
	}
	
	public SIZE getSize() 
	{
		return size;
	}

	public void setSize(SIZE size) 
	{
		this.size = size;
	}
	
	abstract double calcPrice();

	@Override
	public boolean equals(Object object) 
	{
		if (this == object)
			return true;
		if (object == null)
			return false;
		if (getClass() != object.getClass())
			return false;
		Beverage another = (Beverage) object;
		if (beverageName == null) {
			if (another.beverageName != null)
				return false;
		} else if (!beverageName.equals(another.beverageName))
			return false;
		if (size != another.size)
			return false;
		if (type != another.type)
			return false;
		return true;
	}
	
	@Override
	public String toString() 
	{
		return "Beverage [name = " + beverageName + ", type = " + type + ", size = " + size + "]";
	}
}