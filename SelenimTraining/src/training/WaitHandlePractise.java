package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class WaitHandlePractise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		driver.findElement(By.id("timingAlert"));
		System.out.println("Clicked on the timing alert button");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		System.out.println("Alert accepted");
		driver.quit();
	Function<WebElement, Boolean>	

	}

}
