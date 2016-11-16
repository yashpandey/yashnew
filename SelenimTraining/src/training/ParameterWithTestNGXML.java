package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParameterWithTestNGXML {
	WebDriver driver;
  @Test
  @Parameters({"author","searchkey"})
  public void testParameterWithXML(@Optional("abc")String author , String searchkey)
  {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://google.com");
	  WebElement searchText = driver.findElement(By.id("lst-ib"));
	  searchText.sendKeys(searchkey);
	  System.out.println("Welcome"+author+"Your search is :"+searchkey);
	  System.out.println("Value at the search box :"+searchText.getAttribute("value")+"Value provided as the input :"+searchkey);
	  Assert.assertTrue(searchText.getAttribute("value").equalsIgnoreCase(searchkey));
  }
}
