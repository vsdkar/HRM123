package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest implements Autoconst {
	public static WebDriver driver;
	@BeforeTest
	public void preCondition() {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver = new ChromeDriver();
		/*System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver = new FirefoxDriver();*/
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	//@AfterTest
	//public void postCondition() {
		//driver.close();
	}
//}
