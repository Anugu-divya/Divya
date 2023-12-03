package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TimePage {

	WebDriver driver;

	public TimePage(WebDriver driverhere) {
		
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='/web/index.php/time/viewTimeModule']")
	WebElement timeclick;
	
	public  Timesheets clicktime () throws InterruptedException {
		Thread.sleep(3000);
	timeclick.click();
  Timesheets te = new Timesheets (driver);
		return te;
	
		}


	


	
}
