package training;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownPractise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-form/");
		org.openqa.selenium.support.ui.Select oSelect = new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("continents")));
        oSelect.selectByVisibleText("Europe");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        oSelect.selectByIndex(2);
        
        List<WebElement> iList = oSelect.getOptions();
        int iSize=iList.size();
        
        for (int i = 0; i < iSize; i++) {
        	String iValue = oSelect.getOptions().get(i).getText();
        	System.out.println(iValue);
        	
        	if (iValue.equals("Africa")) {
				oSelect.selectByIndex(i);
			}
			
		}
	}

	
}
