package training;

import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxPractise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-form/");
		java.util.List<WebElement> rbn = driver.findElements(By.name("sex"));
		boolean bvalue = false;
		bvalue = rbn.get(0).isSelected();
		if(bvalue=true){
			rbn.get(1).click();
		}
		else{
			rbn.get(0).click();
		}
        WebElement rbt_Exp = driver.findElement(By.id("exp-2"));
        rbt_Exp.click();
        
        java.util.List<WebElement> checkbox = driver.findElements(By.name("Profession"));
        int iSize = checkbox.size();
        
        for (int i = 0; i < iSize; i++) {
			String checkValue = checkbox.get(i).getAttribute("value");
			if(checkValue.equalsIgnoreCase("Automation Tester")){
				checkbox.get(i).click();
			}break;
		}
        WebElement skill_checkbox = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
        skill_checkbox.click();
        
        driver.quit();
	}

}
