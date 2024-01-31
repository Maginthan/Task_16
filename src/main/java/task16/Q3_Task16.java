package task16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3_Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch the Chrome browser
		WebDriver driver = new ChromeDriver();

		// Navigate to the URL mentioned below
		driver.navigate().to("https://www.wikipedia.org/");

		// To maximize the browser
		driver.manage().window().maximize();

		// Locate the element and search for query "Artificial Intelligence"
		driver.findElement(By.name("search")).sendKeys("Artificial Intelligence", Keys.ENTER);
		
		//Click the Link test "History"
		driver.findElement(By.linkText("History")).click();
		
		//Get the title of the selected section
		String title = driver.findElement(By.id("History")).getText();
		System.out.print("The title of the section is: " + title);	

	}

}
