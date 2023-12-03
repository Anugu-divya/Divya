package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectInfo {

	WebDriver driver;

	public ProjectInfo(WebDriver driverhere) {
		
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}
		@FindBy(xpath="(//span[@class='oxd-topbar-body-nav-tab-item'])[4]")
	WebElement projectinfo ;
		
		//@FindBy(xpath="")
	//	WebElement ;
		
		public Customers projectinfodropdown () {
			projectinfo.click();
			Customers cu = new Customers (driver);
			return cu;
		}
	

}
