package selenium_compatible_version;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Check_Environment_Version_2 {
	WebDriver driver;

	// Selenium 2 k cần testNG thư viện thì được đóng gói ngay trong thư viện của Selenium 2 luôn
	// Selenium 2 k work với firefox mới nhất, chỉ work với firefox version 47 trở xuống

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
	}

	@Test
	public void f() {
		System.out.println("Actual result: pass");
	}

	@AfterClass
	public void afterClass() {
	}

}
