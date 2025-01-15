package test;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

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
