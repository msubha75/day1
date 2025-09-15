package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSalesforce {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://login.salesforce.com/");
	sleepWait(3);
	driver.findElement(By.id("username")).sendKeys("msubha75762@agentforce.com");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Tiru@1994");
	driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
	sleepWait(6);
	System.out.println("Login passed");
	WebElement homeTitleElem = driver.findElement(By.xpath("//*[@title='Home']/span"));
	if("Home".equals(homeTitleElem.getText())) {
		System.out.println("Home Page present");
	} else {
		System.out.println("Home Page not present");
	}
	sleepWait(3);
	
	driver.quit();

	}


public static void sleepWait(Integer duration) {
	try {
		Thread.sleep(Duration.ofSeconds(duration));
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}

}
