package pageElements;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Attendance {

	WebDriver driver;

	public Attendance(WebDriver driverhere) {

		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[@class='oxd-topbar-body-nav-tab-item'])[2]")
	WebElement attendance;

//	@FindBy(xpath="(//i[@class='oxd-icon bi-chevron-down'])[2]")
	// WebElement dropdown2;
	public myrecords attendanceclick() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		attendance.click();
		// dropdown2.click();
		myrecords mr = new myrecords(driver);
		return mr;
	}
}
