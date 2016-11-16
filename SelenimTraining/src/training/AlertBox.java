package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertBox {

public	static WebDriver driver;
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
        driver.findElement(By.xpath(".//*[@id='content']/p[4]/button")).click();
        Alert myAlert = driver.switchTo().alert();
        System.out.println("Text at the simple alert is :"+myAlert.getText());
        myAlert.accept();
        driver.close();
	}

}
