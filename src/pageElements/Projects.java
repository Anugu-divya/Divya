package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Projects {

	WebDriver driver;

	public Projects(WebDriver driverhere) {
		
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[@class='oxd-topbar-body-nav-tab-item'])[3]")
	WebElement repotrts;
//	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span/i")
//	WebElement dropdown3;
	
	public Projectreports projectdropdown () {
		repotrts.click();
	//	dropdown3.click();
		Projectreports pr = new Projectreports (driver);
		return pr ;
	}

}
