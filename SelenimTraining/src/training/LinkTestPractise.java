package training;

import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTestPractise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseUrl = "http://newtours.demoaut.com/";
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5	, TimeUnit.SECONDS);
        driver.get(baseUrl);
        ArrayList<WebElement> linkElements = (ArrayList<WebElement>) driver.findElement(By.tagName("a"));
        String[] linkText = new String[linkElements.size()];
        
        for (String string : linkText) {
			
		}
	}

}
