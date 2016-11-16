package training;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.opera.core.systems.scope.protos.EcmascriptProtos.Value;

public class CheckBoxRadioButtonPractise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-form/");
		List<WebElement> rbn = driver.findElements(By.name("sex"));
		boolean bvalue = false;
		bvalue = rbn.get(0).isSelected();
		if (bvalue==true) {
			rbn.get(1).click();
		} else
			rbn.get(0).click();
		driver.findElement(By.id("exp-2")).click();
		
		List<WebElement> profession = driver.findElements(By.name("Profession"));
		int iSize = profession.size();
		
		for (int i = 0; i < iSize; i++) {
			String sValue = profession.get(i).getAttribute("value");
			if(sValue.equalsIgnoreCase("Automation Tester")){
				profession.get(i).click();
		}break;

		}
	

	}

}
