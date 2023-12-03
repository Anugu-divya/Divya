package pageElements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Projectreports {

	WebDriver driver;

	public Projectreports(WebDriver driverhere) {
		
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}
	

@FindBy(xpath="(//a[@class='oxd-topbar-body-nav-tab-link'])[1]")
WebElement project ;


@FindBy(xpath="//input[@placeholder='Type for hints...']")
WebElement prname;

@FindBy(xpath="//(//input[@class='oxd-input oxd-input--active'])[2]")
WebElement datefrom;
@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[3]")
WebElement dateto;
@FindBy(xpath="//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
WebElement toggle;
@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
WebElement views;
public Employeereports repotrs () {
	project.click();
	prname.sendKeys("Apache Software Foundation - ASF - Phase 1");
	SoftAssert sa = new SoftAssert();
	System.out.println("Apache Software Foundation - ASF - Phase 1");
	String Expectedtittle = "Select a Project ";
	String runtimetitle = driver.getTitle();
	System.out.println(runtimetitle);
	sa.assertEquals(runtimetitle, Expectedtittle);
	datefrom.sendKeys(Keys.CONTROL + "a");
	datefrom.sendKeys(Keys.DELETE);
	datefrom.sendKeys("2024-12-03");
	dateto.sendKeys(Keys.CONTROL + "a");
	dateto.sendKeys(Keys.DELETE);
	dateto.sendKeys("2024-12-04");
	toggle.click();
	views.click();
	
	
	
	
	Employeereports emr = new Employeereports (driver);
	return emr;
	}

}
//*[@id="app"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/li[1]/a