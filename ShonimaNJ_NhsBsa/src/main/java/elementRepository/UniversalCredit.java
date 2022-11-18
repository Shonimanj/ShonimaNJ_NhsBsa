package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWait;
import utilities.Generalutilities;

public class UniversalCredit {
	WebDriver driver;
	Generalutilities gu=new Generalutilities();
	ExplicitWait ew=new ExplicitWait();



	public UniversalCredit(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//label[@for='yes-universal']")
	WebElement UnversalCreditAsYes;
	
	@FindBy(id = "next-button")
	WebElement next12;
	
	public void clickOnUnversalCreditAsYes()
	{
		gu.clickOnTheElement(UnversalCreditAsYes);
		gu.clickOnTheElement(next12);
	}
	
}
