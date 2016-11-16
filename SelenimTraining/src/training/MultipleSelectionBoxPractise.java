package training;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectionBoxPractise {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriver driver = new FirefoxDriver();
   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   driver.get("http://toolsqa.com/automation-practice-form/");
   Select  oSelect = new Select(driver.findElement(By.id("selenium_commands")));
   oSelect.selectByIndex(0);
   Thread.sleep(5000);
   oSelect.deselectByIndex(0);
   oSelect.selectByVisibleText("Navigation Commands");
   Thread.sleep(5000);
   oSelect.deselectByVisibleText("Navigation Commands");
   List<WebElement> iList = oSelect.getOptions();
   int iSize = iList.size();
   for (int i = 0; i < iSize; i++) {
	String iValue = oSelect.getOptions().get(i).getText();
	System.out.println(iValue);
	oSelect.selectByIndex(i);
	Thread.sleep(2000);
}
   oSelect.deselectAll();
	}

}
