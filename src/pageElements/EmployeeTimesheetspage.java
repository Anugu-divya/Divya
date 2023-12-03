package pageElements;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class EmployeeTimesheetspage {

	WebDriver driver;

	public EmployeeTimesheetspage(WebDriver driverhere) {

		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//i[@class='oxd-icon bi-chevron-down'])[1]")
	WebElement dropdown;
	@FindBy(xpath = "(//a[@class='oxd-topbar-body-nav-tab-link'])[2]")
	WebElement employeeclick;
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	WebElement nameenter;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	WebElement view1;
	//@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
//	WebElement createtimesheets;
//	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")
//	WebElement edit1;
//	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
//	WebElement enterproject;
//	@FindBy(xpath = "//div[@class='oxd-select-text--after']")
//	WebElement enteractivity;
	// @FindBy(xpath =
	// "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[10]/button/i")
//	WebElement delet;
//	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
//	WebElement save2;
//	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
//	WebElement submit1;
//	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[1]/div/div/div/div[2]/textarea")
//	WebElement descrption;
//	// @FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium
//	// oxd-button--ghost\"]")
////	WebElement edit2 ;
//	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[2]/button[2]")
//	WebElement approve;

	public Attendance employeetimesheets() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		dropdown.click();
		employeeclick.click();
		nameenter.sendKeys("CPeter Mac Anderson");

//		SoftAssert sa1 = new SoftAssert();
//		System.out.println("Charlie  Carter ");
//		String Expectedtittle1 = "Invalid";
//		String runtimetitle1 = driver.getTitle();
//		System.out.println(runtimetitle1);
//		sa1.assertEquals(runtimetitle1, Expectedtittle1);
		view1.click();
	//	createtimesheets.click();
//		edit1.click();
//		enterproject.sendKeys("NoRecordsfound");
//		save2.click();
//		submit1.click();
//		descrption.sendKeys("yes");
//		approve.click();
		Attendance ad = new Attendance(driver);
		return ad;
	}

}
//*[@id="app"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li[2]/a