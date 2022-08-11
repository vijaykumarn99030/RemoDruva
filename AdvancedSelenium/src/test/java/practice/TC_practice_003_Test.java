package practice;

import org.testng.annotations.Test;

import genericLibrary.Base_Tests;

public class TC_practice_003_Test extends Base_Tests {
	@Test
	public void test_practice() {
		driver.get("https://www.zomato.com/");
	}

}
