package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2_Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch the Chrome browser
		WebDriver driver = new ChromeDriver();

		// Navigate to the URL mentioned below
		driver.navigate().to("https://www.demoblaze.com/");

		// To maximize the browser
		driver.manage().window().maximize();

		// To verify the title of the Page.
		String title = driver.getTitle();

		if (title.equals("STORE")) {
			System.out.print("Page landed on correct website");
		} else {
			System.out.print("Page not landed on correct website");
		}

	}

}
