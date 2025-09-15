package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testwithinvalidpassword {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		sleepwait(3);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("msubha75762@agentforce.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		sleepwait(3);

		WebElement errorMsgElmt = driver.findElement(By.xpath("//*[@id=\"error\"]"));
		if (!errorMsgElmt.getText().isBlank()) {
			System.out.print("errorMsgElmt: " + errorMsgElmt.getText());
		} else {
			System.out.println("No error message");
		}
		driver.quit();

	}

	private static void sleepwait(Integer duration) {
		try {
			Thread.sleep(Duration.ofSeconds(duration));
		} catch (Exception E) {
			E.printStackTrace();
		}
	}
}
