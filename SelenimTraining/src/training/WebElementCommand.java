package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementCommand {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver =new FirefoxDriver();
  
  driver.get(" http://toolsqa.com/automation-practice-form/");
  
  /*driver.findElement(By.name("firstname")).sendKeys("Yash");
  driver.findElement(By.name("lastname")).sendKeys("Pandey");
  driver.findElement(By.id("submit")).click();*/
  
  driver.findElement(By.partialLinkText("Partial Link Test")).click();
  System.out.println("Partial link test pass");
  driver.navigate().back();
  
  String submitText = driver.findElement(By.tagName("button ")).toString();
  System.out.println(submitText);
  
  driver.findElement(By.linkText("Link Test")).click();
  System.out.println("Link text result pass");
	}

}
