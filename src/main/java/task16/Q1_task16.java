package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q1_task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch the Firefox browser
		WebDriver driver = new FirefoxDriver();

		// Navigate to the URL mentioned below
		driver.navigate().to("http://google.com");

		// To maximize the browser
		driver.manage().window().maximize();

		// Print the current URL of the current page
		String url = driver.getCurrentUrl();
		System.out.print("Current URL: " + url);

		// Reload the page
		driver.navigate().refresh();

		// To close the browser
		driver.close();
	}

}
