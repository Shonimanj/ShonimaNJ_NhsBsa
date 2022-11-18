package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWait;
import utilities.Generalutilities;

public class ParnterStatus {
	WebDriver driver;
	Generalutilities gu=new Generalutilities();
	ExplicitWait ew=new ExplicitWait();

	public ParnterStatus(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="label-yes")
	WebElement partneryes;
	@FindBy(id="next-button")
	WebElement next5;

	public void clickONliveWithPartneryes()
	{
		gu.clickOnTheElement(partneryes);
		gu.clickOnTheElement(next5);
	}


}
