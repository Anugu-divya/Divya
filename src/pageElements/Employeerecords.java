package pageElements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Employeerecords {

	WebDriver driver;

	public Employeerecords(WebDriver driverhere) {

		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

//	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[3]/a")
//	WebElement records;
	@FindBy(xpath = "(//a[@class='oxd-topbar-body-nav-tab-link'])[3]")
	WebElement records;
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	WebElement nameenter1;
	@FindBy(xpath = "//i[@class='oxd-icon bi-calendar oxd-date-input-icon']")
	WebElement datetype1;
	@FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--secondary'])[1]")
	WebElement view12;
	@FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--secondary'])[2]")
	WebElement add2;
	@FindBy(xpath = "//i[@class='oxd-icon bi-calendar oxd-date-input-icon']")
	WebElement datetype2;
	@FindBy(xpath = "//i[@class='oxd-icon bi-clock oxd-time-input--clock']")
	WebElement time2;
	@FindBy(xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
	WebElement comment2;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement out2;

	public Configuration emprec() {
		
		records.click();
		nameenter1.sendKeys("Charlie  Carter");
		SoftAssert sa1 = new SoftAssert();
		System.out.println("Charlie  Carter ");
		String Expectedtittle1 = "Invalid";
		String runtimetitle1 = driver.getTitle();
		System.out.println(runtimetitle1);
		sa1.assertEquals(runtimetitle1, Expectedtittle1);
		datetype1.sendKeys(Keys.CONTROL + "a");
		datetype1.sendKeys(Keys.DELETE);
		datetype1.sendKeys("2023-11-31");
		view12.click();
		add2.click();
		datetype2.sendKeys(Keys.CONTROL + "a");
		datetype2.sendKeys(Keys.DELETE);
		datetype2.sendKeys("2023-11-31");

		time2.sendKeys(Keys.CONTROL + "a");
		time2.sendKeys(Keys.DELETE);
		time2.sendKeys("10:16 AM");

		comment2.sendKeys("yes");

		out2.click();

		Configuration cf = new Configuration(driver);
		return cf;

	}

}
