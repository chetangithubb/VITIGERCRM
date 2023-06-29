package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

	//decladration
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Organizations']")private WebElement orgLink;
	@FindBy(xpath = "//a[text()='Contacts']")private WebElement  contactLink;
	@FindBy(xpath = "//a[text()='Opportunities']")private WebElement opportunityLink;
	@FindBy(xpath = "(//td[@class='small'])[2]")private WebElement adminimage;
	@FindBy(xpath = "(//a[@class='drop_down_usersettings'])[2]")private WebElement signout;
	
//	constructor
	
	public homePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrgLink() {
		return orgLink;
	}

	public WebElement getContactLink() {
		return contactLink;
	}

	public WebElement getOpportunityLink() {
		return opportunityLink;
	}

	public WebElement getAdminimage() {
		return adminimage;
	}

	public WebElement getSignout() {
		return signout;
	}
	
}

