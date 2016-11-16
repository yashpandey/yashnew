package training;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class SecondAssignment {
  WebDriver driver;
 // @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
@Test(priority=1)
public void testStep1(){
//	driver.get("http://www.makemytrip.com");
//	driver.manage().window().maximize();
//	//Opening makemyTrip.com
//	driver.findElement(By.xpath("//ul[@class='tabs_list clearfix']/li[5]/a")).click();
//	//Tapping on the Flight+Hotel button
//	WebDriverWait wait_Fight_Hotels = new WebDriverWait(driver, 10);
//	wait_Fight_Hotels.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='widget_row']/div[1]/div/div[3]/div/div[1]/h1")));
//	//Applying wait condition for the confirming the presence of the "Book Flight Plus Hotel Combo & Save More ! " Text in the page
//	driver.findElement(By.className("radio_state")).click();
//	//Clicking on the Radio button
//	driver.findElement(By.id("flightDeparture_1")).clear();
//	//Clearing the text at the departure city name
//	driver.findElement(By.id("flightDeparture_1")).sendKeys("Pune");
//	//Sending keys Pune at the Textbox
//	driver.findElement(By.className("tt-dropdown-menu")).click();
//	//Clicking at the suggestion drop down for pune
//	driver.findElement(By.id("flightDestination_1")).clear();
//	driver.findElement(By.id("flightDestination_1")).sendKeys("New Delhi");
//	driver.findElement(By.xpath(".//*[@id='flightMainDiv_1']/div[2]/div/div[2]/span/span/div/span/div/p")).click();
//	driver.findElement(By.cssSelector("html.js.flexbox.flexboxlegacy.canvas.canvastext.webgl.no-touch.geolocation.postmessage.no-websqldatabase.indexeddb.hashchange.history.draganddrop.websockets.rgba.hsla.multiplebgs.backgroundsize.borderimage.borderradius.boxshadow.textshadow.opacity.cssanimations.csscolumns.cssgradients.no-cssreflections.csstransforms.csstransforms3d.csstransitions.fontface.generatedcontent.video.audio.localstorage.sessionstorage.webworkers.applicationcache.svg.inlinesvg.smil.svgclippaths body div#ui-datepicker-div.ui-datepicker.ui-widget.ui-widget-content.ui-helper-clearfix.ui-corner-all.ui-datepicker-multi.ui-datepicker-multi-2")).click();
	SimpleDateFormat sdf = new SimpleDateFormat("dd");
	Calendar c = Calendar.getInstance();
	c.setTime(new Date()); // Now use today date.
	//c.add(Calendar.DATE, 4); // Adding 4 days
	String output = sdf.format(c.getTime());
	System.out.println(output);
	/*WebElement date_Picker = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]"));
	java.util.List<WebElement> arraylist_datePicker = date_Picker.findElements(By.partialLinkText("9"));
	System.out.println(date_Picker.getText());*/
	
	
}
}
