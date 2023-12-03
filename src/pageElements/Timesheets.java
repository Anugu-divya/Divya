package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Timesheets {
	WebDriver driver;
	
	public Timesheets(WebDriver driverhere) {
	this.driver = driverhere;
	PageFactory.initElements(driver, this);
		}
	
	
	@FindBy(xpath="(//span[@class='oxd-topbar-body-nav-tab-item'])[1] ")
	WebElement timesheet;
//@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span/i")
//	WebElement dropdown;
	
	public MyTimesheetspage sheetstime () throws InterruptedException {
		Thread.sleep(3000);
		timesheet.click();
		Thread.sleep(3000);
	//	dropdown.click();
		MyTimesheetspage tss = new MyTimesheetspage (driver);
		return tss;
	
	}

}
