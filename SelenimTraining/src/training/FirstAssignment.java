package training;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class FirstAssignment {
	WebDriver driver;
	@BeforeClass
	public void setUp(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority=1)
	public void testCase1(){
		driver.get("http://www.ehow.com");
		driver.findElement(By.xpath(".//*[@id='primaryNav']/ul/li[6]/a")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/section/header/h1")));
		driver.findElement(By.xpath(".//*[@id='searchHeader']/input[1]")).sendKeys("Birthday cake");
		driver.findElement(By.xpath(".//*[@id='searchHeader']/input[4]")).click();
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='Body']/ul/li[1]/a")));
		driver.findElement(By.linkText("Articles")).click();
		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		wait3.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='Body']/div[1]/div/ul[1]/li[1]/a/b")));
		driver.findElement(By.xpath(".//*[@id='searchHeader']/input[1]")).clear();
		driver.findElement(By.xpath(".//*[@id='searchHeader']/input[1]")).sendKeys("How to Make a Birthday Cake Cones");
		driver.findElement(By.xpath(".//*[@id='searchHeader']/input[4]")).click();
		driver.findElement(By.xpath(".//*[@id='Body']/div[1]/div/ul[1]/li[1]/a/b")).click();
		WebElement scroll = driver.findElement(By.xpath(".//*[@id='Body']/div[3]/article/section[1]/h2"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		WebElement instruction_header = driver.findElement(By.xpath(".//*[@id='Body']/div[3]/article/section[1]/ol"));
		List<WebElement> arraylist_Instruction = instruction_header.findElements(By.tagName("li"));
		System.out.println(arraylist_Instruction.size());
	}
	@AfterClass
	public void tearDown(){
		
	}
}
