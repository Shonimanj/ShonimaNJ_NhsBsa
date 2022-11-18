package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWait;
import utilities.Generalutilities;

public class Country {
	WebDriver driver;
	Generalutilities gu=new Generalutilities();
	ExplicitWait ew=new ExplicitWait();
	public Country(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="label-england")
	WebElement england;
	@FindBy(id = "next-button")
	WebElement next1;

	@FindBy(xpath = "//button[@id='nhsuk-cookie-banner__link_accept_analytics']")
	WebElement CookiesOkButton;
	public void clickOnCookiesOK()
	{

		ew.explicitWaitMethod(CookiesOkButton, driver);

		gu.clickOnTheElement(CookiesOkButton);
	}

	public void clickOnEngland()
	{
		gu.clickOnTheElement(england);
	}
	public void clickonNextButtonInCountry()
	{
		gu.clickOnTheElement(next1);
	}

}
