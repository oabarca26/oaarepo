import java.util.ArrayList;
import java.util.Random;

public class Order implements OrderInterface, Comparable<Order> 
{
	private int orderNum;
	private int orderTime;
	private DAY orderDay;
	private Customer customer;
	private ArrayList<Beverage> beverages;

	public Order(int time, DAY day, Customer customer) 
	{
		Random rand = new Random();
		this.orderNum = rand.nextInt(90000 - 10000) + 10000;
		this.orderTime = time;
		this.orderDay = day;
		this.customer = new Customer(customer);
		this.beverages = new ArrayList<Beverage>();
	}
	
	public int getOrderNum() 
	{
		return orderNum;
	}

	public int getOrderTime() 
	{
		return orderTime;
	}
	
	public DAY getOrderDay() 
	{
		return orderDay;
	}
	
	public Customer getCustomer() 
	{
		return customer;
	}
	
	public int getTotalItems() 
	{
		return this.beverages.size();
	}
	
	public ArrayList<Beverage> getBeverages() 
	{
		return beverages;
	}
	
	public void setOrderNum(int orderNumber) 
	{
		this.orderNum = orderNumber;
	}

	public void setOrderTime(int orderTime) 
	{
		this.orderTime = orderTime;
	}

	public void setOrderDay(DAY orderDay) 
	{
		this.orderDay = orderDay;
	}

	public void setCustomer(Customer customer) 
	{
		this.customer = customer;
	}

	public void setBeverages(ArrayList<Beverage> beverages) 
	{
		this.beverages = beverages;
	}

	@Override
	public boolean isWeekend() 
	{
		switch (this.orderDay) 
		{
			case SATURDAY:
			case SUNDAY: return true;
			default: return false;
		}
	}

	@Override
	public Beverage getBeverage(int itemNum) 
	{
		return this.beverages.get(itemNum);
	}

	@Override
	public void addNewBeverage(String bevName, SIZE size) 
	{
		this.beverages.add(new Alcohol(bevName, size, this.isWeekend()));
	}

	@Override
	public void addNewBeverage(String bevName, SIZE size, int numFruits, boolean addProtien) 
	{
		this.beverages.add(new Smoothie(bevName, size, numFruits, addProtien));
	}
	
	@Override
	public void addNewBeverage(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) 
	{
		this.beverages.add(new Coffee(bevName, size, extraShot, extraSyrup));
	}

	@Override
	public double calcOrderTotal() 
	{
		double total = 0.0;
		for (Beverage bev: this.beverages) 
		{
			total += bev.calcPrice();
		}
		return total;
	}
	
	@Override
	public int compareTo(Order compare) 
	{
		if (this.orderNum > compare.getOrderNum()) 
		{
			return 1;
		} else if(this.orderNum < compare.orderNum) 
		{
			return -1;
		} else 
		{
			return 0;
		}
	}

	@Override
	public int findNumOfBeveType(TYPE type) 
	{
		int result = 0;
		for (Beverage bev: beverages) 
		{
			if (bev.getType() == type) 
			{
				result++;
			}
		}
		return result;
	}
	
	@Override
	public String toString() 
	{
		return "Order [orderNo=" + orderNum + ", orderTime=" + orderTime + ", orderDay=" + orderDay + ", customer="
				+ customer + ", beverages=" + beverages + ", orderTotal=" + this.calcOrderTotal() + "]";
	}
}
