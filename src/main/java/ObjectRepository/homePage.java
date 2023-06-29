package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage {

	//decladration
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Organizations']")private WebElement orgLink;
	@FindBy(xpath = "//a[text()='Contacts']")private WebElement  contactLink;
	@FindBy(xpath = "//a[text()='Opportunities']")private WebElement opportunityLink;
	@FindBy(xpath = "(//td[@class='small'])[2]")private WebElement adminimage;
	@FindBy(xpath = "")private WebElement signout;
	
//	constructor
	
	public WebDriver driver;
}

