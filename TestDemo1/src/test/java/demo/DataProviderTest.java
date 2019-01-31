package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@DataProvider(name = "testdata")
	public Object[][] testData() {
		Object[][] data = new Object[2][2];

		data[0][0] = "Test 1";
		data[0][1] = "Test 2";

		data[1][0] = "Test 3";
		data[1][1] = "Test 4";

		return data;

	}
	
	@Test(dataProvider = "testdata")
	public void test(String s1, String s2) {
		System.out.println("s1" + s1 + "s2" + s2);
	}
}
