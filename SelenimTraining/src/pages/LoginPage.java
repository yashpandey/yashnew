package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElement;

public class LoginPage {
 private static WebElement element = null;
 
 public static WebElement linkMyAccount(WebDriver driver) {
	element = driver.findElement(By.className("account_icon"));
	return element;
}
 public static WebElement linkLogOut(WebDriver driver) {
	element = driver.findElement(By.id("account_logout"));
	return element;
}
}
