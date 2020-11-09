public class HolidayBonus {
	
	public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other) 
	{
		double bonusHoliday = 0;
		double[] bonus = calculateHolidayBonus(data, high, low, other);
		for (int row = 0; row < bonus.length; row++) 
		{
			bonusHoliday += bonus[row];
		}
		return bonusHoliday;
	}
	
	public static double[] calculateHolidayBonus(double[][] data, double high, double low, double other) 
	{
		double[] bonus = new double[data.length];
		for (int row = 0; row < bonus.length; row++) 
		{
			for (int column = 0; column < data[row].length; column++) 
			{
				if (data[row][column] >= 0) 
				{
					if (data[row][column] == TwoDimRaggedArrayUtility.getHighestInColumn(data, column)) 
					{
						bonus[row] += high;
					} 
					else if (data[row][column] == TwoDimRaggedArrayUtility.getLowestInColumn(data, column)) 
					{
						bonus[row] += low;
					} 
					else 
					{
						bonus[row] += other;
					}
				}
			}
		}
		return bonus;
	}
}
