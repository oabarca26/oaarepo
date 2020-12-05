public class Customer 
{
	private String name;
	private int age;

	public Customer(Customer another) 
	{
		this.name = another.getName();
		this.age = another.getAge();
	}
	
	public Customer(String name, int age) 
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName() 
	{
		return name;
	}

	public int getAge() 
	{
		return age;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}
	
	@Override
	public String toString() 
	{
		return "Customer [name=" + name + ", age=" + age + "]";
	}
}
