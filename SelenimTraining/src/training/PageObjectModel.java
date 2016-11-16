package training;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogInPage2;
import module.SignInAction;
import utility.Constants;
import utility.ExcelUtility;

public class PageObjectModel {
private static WebDriver driver=null;
private static Logger log = Logger.getLogger(mx4j.log.Logger.class.getName());
public static void main(String[] args) {
	
	driver = new FirefoxDriver();
	log.info("New Driver initiated ");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	log.info("Implict wait applied to the driver for 10 seconds");
	driver.get(Constants.URL);
	log.info("Web application launched");
	SignInAction.Execute(driver);
	log.info("Sign action is being initiated username and password are being passed as parameters");
	System.out.println("Logging in the will take some time");
	//LoginPage.linkLogOut(driver).click();
}
}
