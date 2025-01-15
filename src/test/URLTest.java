package test;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

// This test will have the user enter a URL. If the URL is valid, the web page will open to the
// valid URL, and the site title will be printed to the console. If the URL is not valid, the user
// will receive an "Invalid URL" message.
public class URLTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a URL: ");
		String x = scanner.next();
		
		System.setProperty("webdriver.edge.driver", "C:\\selenium webdriver\\EdgeDriver\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		try {
			driver.get(x);
			System.out.println("Site Title: " + driver.getTitle());
			Thread.sleep(2000);
		}
		catch (Exception e) {
			System.out.println("Invalid URL");
		}
		scanner.close();
		driver.quit();

	}

}
