package pageElements;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyTimesheetspage {

	WebDriver driver;

	public MyTimesheetspage(WebDriver driverhere) {

		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//i[@class='oxd-icon bi-chevron-down'])[1]")
	WebElement dropdown;
	@FindBy(xpath = "(//a[@class='oxd-topbar-body-nav-tab-link'])[1]")
	WebElement time1;
	@FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--ghost\"]")
	WebElement edit;
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	WebElement cilentname;
	@FindBy(xpath = "//div[@class='oxd-select-text--after']")
	WebElement activity;
	// @FindBy(xpath =
	// "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[10]/button/i")
//	WebElement delet;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement save;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement submit;
	@FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
	WebElement delet;

	public EmployeeTimesheetspage timesheets() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		dropdown.click();
		time1.click();
		edit.click();
		cilentname.sendKeys("Apache Software Foundation - ASF - Phase 1");
		activity.click();
		delet.click();
		save.click();
		submit.click();
		delet.click();	// driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[1]/div/div[2]/div/div/input")).sendKeys("Apache
		// Software Foundation - ASF - Phase 1");
		EmployeeTimesheetspage emp = new EmployeeTimesheetspage(driver);
		return emp;
	}
}
