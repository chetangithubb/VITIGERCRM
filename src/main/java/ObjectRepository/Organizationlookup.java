package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organizationlookup { 
	@FindBy(xpath = "//img[@title=\"Create Organization...\"]")private WebElement orgLookuplink;
	//constructor
	public Organizationlookup(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getOrgLookuplink() {
		return orgLookuplink;
	}
	

}
