package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day1 {
	
	@BeforeClass
	public void BeforeTest() {
		System.out.println("I will execute before day1 class");
	}
	
	@AfterTest
	public void Last() {
		System.out.println("I will execute after test");
	}
	
	@Test
	public void Demo() {
		System.out.println("Hello");
	}
	@Test
	public void Demo1() {
		System.out.println("Bye");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("Iwill execute after suite");
	}
	
	@AfterClass
	public void Afterclass() {
		System.out.println("I will execute after day1 class");
	}
	

}
