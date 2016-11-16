package module;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogInPage2;
import utility.ExcelUtility;
public class SignInAction {
	@Test
	@Parameters({"sUsername","sPassword"})

	public static void Execute(WebDriver driver , String sUsername , String sPassword) {
		
		LoginPage.linkMyAccount(driver).click();
		LogInPage2.txtbx_Username(driver).sendKeys(sUsername);
		LogInPage2.txtbx_Password(driver).sendKeys(sPassword);
		LogInPage2.btn_LogIn(driver).click();
	}

}
