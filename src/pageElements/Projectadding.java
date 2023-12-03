package pageElements;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Projectadding {

	WebDriver driver;

	public Projectadding(WebDriver driverhere) {

		this.driver = driverhere;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[2]")
	WebElement projectadd;
	@FindBy(xpath = "(//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active'])[1]")
	WebElement customername;
	@FindBy(xpath = "(//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active'])[2]")
	WebElement projectname;
	@FindBy(xpath = "(//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active'])[1]")
	WebElement projectadmin;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	WebElement search;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement add4;
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement nombre2;
	//@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[1]")
	//WebElement nombres;
	//input[@class='oxd-input oxd-input--active']
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active']")
	WebElement addcustomer;
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active']")
	WebElement nombres;
	
	@FindBy(xpath = "(//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'])[2]")
	WebElement descriptions;
	
	@FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--secondary'])[1]")
	WebElement savedailogue;
	
	@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[2]")
	WebElement pr0jectadmin;
	
	@FindBy(xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
	WebElement descriptionsmain;
	@FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'])[1]")
	WebElement savemain;

	public Projectadding adding() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		projectadd.click();
		customername.sendKeys("ACME Ltd");
		SoftAssert sa = new SoftAssert();
		System.out.println("ACME Ltd");
		String Expectedtittle = "Select a Project ";
		String runtimetitle = driver.getTitle();
		System.out.println(runtimetitle);
		sa.assertEquals(runtimetitle, Expectedtittle);

		projectname.sendKeys("ACME Ltd");
		SoftAssert sa1 = new SoftAssert();
		System.out.println("ACME Ltd");
		String Expectedtittle1 = "Select a Project ";
		String runtimetitle1 = driver.getTitle();
		System.out.println(runtimetitle1);
		sa1.assertEquals(runtimetitle1, Expectedtittle1);

		projectadmin.sendKeys("Linda Jane Anderson");
		SoftAssert sa2 = new SoftAssert();
		System.out.println("ACME Ltd");
		String Expectedtittle2 = "Select a Project ";
		String runtimetitle2 = driver.getTitle();
		System.out.println(runtimetitle2);
		sa2.assertEquals(runtimetitle2, Expectedtittle2);
		search.click();
		add4.click();
		nombre2.sendKeys("ACME Ltd");
		addcustomer.click();
		nombres.sendKeys("Divya");
		descriptions.sendKeys("completed");
		savedailogue.click();
		pr0jectadmin.sendKeys("Rakesh");
		descriptionsmain.sendKeys("done");
		savemain.click();
		Projectadding pag = new Projectadding(driver);
		return pag;
	}

}
