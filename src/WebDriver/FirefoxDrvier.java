package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDrvier {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.geckodriver.driver",
				"D:\\progs\\testing\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.google.com");
		driver.quit();
		
	}

}
