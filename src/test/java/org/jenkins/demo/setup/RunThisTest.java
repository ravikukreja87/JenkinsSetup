package org.jenkins.demo.setup;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunThisTest {
	
	@Test
	public void openBrowserAndNavigateToGoogle() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	

}
