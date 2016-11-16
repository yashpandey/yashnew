package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingTablePractise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://toolsqa.com/automation-practice-table/");
       String sValue = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/table/tbody/tr[1]/td[2]")).getText();
       System.out.println(sValue);
       
       driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div/div/table/tbody/tr[1]/td[6]/a")).click();
       System.out.println("Link has been clicked otherwise it will throw exception");
       driver.quit();
	}

}
