package training;

import java.util.concurrent.TimeUnit;

import org.apache.jasper.tagplugins.jstl.core.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchWindowCommandPractise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		String handle =driver.getWindowHandle();
		System.out.println(handle);
		driver.findElement(By.name("New Message Window")).click();
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//WebElement element = wait.until(ExpectedConditions.)
		java.util.Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		for (String handle1 : driver.getWindowHandles()) {
			System.out.println(handle1);
			driver.switchTo().window(handle1);
		}
		driver.quit();

	}
	

}
