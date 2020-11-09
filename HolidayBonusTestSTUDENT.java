import static org.junit.Assert.*;
import org.junit.Test;

public class HolidayBonusTestSTUDENT {
	private double[][] dataset1 = {{-1.4, -25.0, -7.2}, {83.5}, {64.9, 10.6, -12.0}, {-1.0, 10}};
	private double[][] dataset2 = {{-7.9, 38.2}, {35.1, -17.6, 47}, {-61.0, -27.9}, {51.5, 2.6, 45.9}};

	@Test
	public void testCalculateTotalHolidayBonus() {
		assertEquals(20000.0,HolidayBonus.calculateTotalHolidayBonus(dataset1, 7000, 2000, 3000),.01);
		assertEquals(22500.0,HolidayBonus.calculateTotalHolidayBonus(dataset2, 6000, 500, 2000),.01);
	}
	
	@Test
	public void testCalculateHolidayBonusSTUDENT() {
		double[] result = HolidayBonus.calculateHolidayBonus(dataset1,7000,2000,3000);
		assertEquals(0.0,result[0],.01);
		assertEquals(7000.0,result[1],.01);
		assertEquals(10000.0,result[2],.01);
		assertEquals(3000.0,result[3],.01);

		result = HolidayBonus.calculateHolidayBonus(dataset2,6000,500,2000);
		assertEquals(6000.0,result[0],.01);
		assertEquals(8000.0,result[1],.01);
		assertEquals(0.0,result[2],.01);
		assertEquals(8500.0,result[3],.01);
	}
}