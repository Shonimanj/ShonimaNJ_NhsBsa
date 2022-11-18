package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWait;
import utilities.Generalutilities;

public class Dental {
	WebDriver driver;
	Generalutilities gu=new Generalutilities();
	ExplicitWait ew=new ExplicitWait();

	public Dental(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="label-england")
	WebElement DentalCountry;
	@FindBy(id = "next-button")
	WebElement next3;

	public void clickonDentalCountryAsEngland()
	{
		gu.clickOnTheElement(DentalCountry);
	}
	public void nextButton()
	{
		gu.scrollDown(driver);
		gu.clickOnTheElement(next3);
	}

}
