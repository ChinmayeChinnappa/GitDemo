package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test
	public void Demo3() {
		System.out.println("good");
	}
	
	@BeforeTest
	public void prerequists() {
		System.out.println("Iwill execute before test");
	}
}
