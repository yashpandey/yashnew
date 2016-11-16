package training;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class AleryPractise{
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		driver.findElement(By.xpath(".//*[@id='content']/p[3]/button")).click();
		Set handles = driver.getWindowHandles();
		System.out.println(handles);
		for (String handle1 : driver.getWindowHandles()) {
			System.out.println(handle1);
			driver.switchTo().window(handle1);
		}
		driver.close();
	}
}