package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDemo {
 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\progs\\testing\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		driver.quit();
	}

}
