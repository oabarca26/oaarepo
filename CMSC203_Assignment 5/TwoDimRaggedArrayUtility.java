
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility 
{
	
	public static double getAverage(double[][] data) 
	{
		int counter = 0;
		double total = 0;
		for (int row = 0; row < data.length; row++) 
		{
			for (int columnumn = 0; columnumn < data[row].length; columnumn++) 
			{
				total += data[row][columnumn];
				counter++;
			}
		}
		return (total/counter);
	}

	public static double getColumnTotal(double[][] data, int column) 
	{
		double total = 0;
		for (int row = 0; row < data.length; row++) 
		{
			if (column < data[row].length) 
			{
				total += data[row][column];
			}
		}
		return total;
	}

	public static double getHighestInArray(double[][] data) 
	{
		double highestIn = data[0][0];
		for (int row = 0; row < data.length; row++) 
		{
			for (int column = 0; column < data[row].length; column++) 
			{
				if (data[row][column] > highestIn) 
				{
					highestIn = data[row][column];
				}			
			}
		}
		return highestIn;
	}

	public static int getHighestInColumnIndex(double[][] data, int column) 
	{
		int highestIn = 0, checker = 0;
		double highest = data[0][0];
		while (checker < data.length) 
		{
			if (column < data[checker].length) 
			{
				highest = data[checker][column];
				break;
			} 
			else 
			{
				checker++;
			}
		}
		for (int row = 0; row < data.length; row++) 
		{
			if (column < data[row].length) 
			{
				if (data[row][column] > highest) 
				{
					highest = data[row][column];
					highestIn = row;
				}
			}
		}
		return highestIn;
	}
	
	public static double getHighestInColumn(double[][] data, int column) 
	{
		int checker = 0;
		double highestIn = data[0][0];
		while (checker < data.length) 
		{
			if (column < data[checker].length) 
			{
				highestIn = data[checker][column];
				break;
			} 
			else 
			{
				checker++;
			}
		}
		for (int row = 0; row < data.length; row++) 
		{
			if (column < data[row].length)  
			{
				if (data[row][column] > highestIn) 
				{
					highestIn = data[row][column];
				}
			}
		}
		return highestIn;
	}

	public static int getHighestInRowIndex(double[][] data, int row) 
	{
		int highestIn = 0, checker = 0;
		double highest = data[0][0];
		while (checker < data.length) 
		{
			if (checker < data[row].length) 
			{
				highest = data[row][checker];
				break;
			} 
			else 
			{
				checker++;
			}
		}
		for (int column = 0; column < data[row].length; column++) 
		{
			if (data[row][column] > highest) 
			{
				highest = data[row][column];
				highestIn = column;
			}
		}
		return highestIn;
	}
	
	public static double getHighestInRow(double[][] data, int row) 
	{
		int checker = 0;
		double highestIn = data[0][0];
		while (checker < data.length) 
		{
			if (checker < data[row].length) 
			{
				highestIn = data[row][checker];
				break;
			} 
			else 
			{
				checker++;
			}
		}
		for (int column = 0; column < data[row].length; column++) 
		{
			if (data[row][column] > highestIn) 
			{
				highestIn = data[row][column];
			}
		}
		return highestIn;
	}

	public static double getLowestInArray(double[][] data) 
	{
		double lowestIn = data[0][0];
		for (int row = 0; row < data.length; row++) 
		{
			for (int column = 0; column < data[row].length; column++) 
			{
				if (data[row][column] < lowestIn) 
				{
					lowestIn = data[row][column];
				}			
			}
		}
		return lowestIn;
	}

	public static int getLowestInColumnIndex(double[][] data, int column) 
	{
		int lowestIn = 0, checker = 0;
		double lowest = data[0][0];
		while (checker < data.length) 
		{
			if (column < data[checker].length) 
			{
				lowest = data[checker][column];
				break;
			} 
			else 
			{
				checker++;
			}
		}
		for (int row = 0; row < data.length; row++) 
		{
			if (column < data[row].length) 
			{
				if (data[row][column] < lowest) 
				{
					lowest = data[row][column];
					lowestIn = row;
				}
			}
		}
		return lowestIn;
	}
	
	public static double getLowestInColumn(double[][] data, int column) 
	{
		int checker = 0;
		double lowestIn = data[0][0];
		while (checker < data.length) 
		{
			if (column < data[checker].length) 
			{
				lowestIn = data[checker][column];
				break;
			} 
			else 
			{
				checker++;
			}
		}
		for (int row = 0; row < data.length; row++) 
		{
			if (column < data[row].length) 
			{
				if (data[row][column] < lowestIn) 
				{
					lowestIn = data[row][column];
				}
			}
		}
		return lowestIn;
	}
	
	public static int getLowestInRowIndex(double[][] data, int row) 
	{
		int lowestIn = 0, checker = 0;
		double lowest = data[0][0];
		while (checker < data.length) 
		{
			if (checker < data[row].length) 
			{
				lowest = data[row][checker];
				break;
			} 
			else 
			{
				checker++;
			}
		}
		for (int column = 0; column < data[row].length; column++) 
		{
			if (data[row][column] < lowest) 
			{
				lowest = data[row][column];
				lowestIn = column;
			}
		}
		return lowestIn;
	}
	
	public static double getLowestInRow(double[][] data, int row) 
	{
		int checker = 0;
		double lowestIn = data[0][0];
		while (checker < data.length) 
		{
			if (checker < data[row].length) 
			{
				lowestIn = data[row][checker];
				break;
			} 
			else 
			{
				checker++;
			}
		}
		for (int column = 0; column < data[row].length; column++) 
		{
			if (data[row][column] < lowestIn) 
			{
				lowestIn = data[row][column];
			}
		}
		return lowestIn;
	}

	public static double getRowTotal(double[][] data, int row) 
	{
		double total = 0;
		for (int column = 0; column < data[row].length; column++) 
		{
			total += data[row][column];
		}
		return total;
	}

	public static double getTotal(double[][] data) 
	{
		double total = 0;
		for (int row = 0; row < data.length; row++) 
		{
			for (int columnumn = 0; columnumn < data[row].length; columnumn++) 
			{
				total += data[row][columnumn];
			}
		}
		return total;
	}

	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException 
	{
		PrintWriter file = new PrintWriter(outputFile);
		for (int row = 0; row < data.length; row++) 
		{
			for (int column = 0; column < data[row].length; column++) 
			{
				file.print((column != 0) ? " " + data[row][column] : data[row][column]);
			}
			file.println();
		}
		file.close();
	}
	
	public static double[][] readFile(File file) throws FileNotFoundException 
	{
		String[][] fileInput = new String[10][10];
		Scanner scanner = new Scanner(file);
		int row = 0, column = 0;
		while (scanner.hasNextLine()) 
		{
			String[] currentRow = scanner.nextLine().split(" ");
			for (column = 0; column < currentRow.length; column++) 
			{
				fileInput[row][column] = currentRow[column];
			}
			row++;
		}
		scanner.close();

		double[][] sales = new double[row][];

		for (row = 0; row < sales.length; row++) 
		{
			for (column = 0; fileInput[row][column] != null; column++) 
			{	
				
			}			
			sales[row] = new double[column];
			for (column = 0; column < sales[row].length; column++) 
			{
				sales[row][column] = Double.parseDouble(fileInput[row][column]);
			}
		}
		return sales;
	}
}
