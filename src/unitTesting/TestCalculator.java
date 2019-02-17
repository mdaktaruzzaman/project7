package unitTesting;

import org.testng.Assert;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int additionResult = cal.addition(10, 20);
		Assert.assertEquals(additionResult, 30);
		int substractionResult =cal.substraction(50, 30);
		Assert.assertEquals(substractionResult, 20);
		

	}

}
