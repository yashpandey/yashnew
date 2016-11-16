package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingTablePractise2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.get("http://toolsqa.com/automation-practice-table/");

	}

}
