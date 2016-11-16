package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Parameterization {
	WebDriver driver;
  @Test
  public void setUp() throws InterruptedException {
	  String author = "Guru99";
	  String searchkey = "india";
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://google.com");
	  WebElement searchtext = driver.findElement(By.id("lst-ib"));
	  searchtext.sendKeys(searchkey);
	  System.out.println("Welcome"+author+"You send the key :"+searchkey);
	  Thread.sleep(3000);
	  System.out.println("Value at google search box :"+searchtext.getAttribute("value")+"::Value given by input :"+searchkey);
	  Assert.assertTrue(searchtext.getAttribute("value").equalsIgnoreCase(searchkey));
  }
}
