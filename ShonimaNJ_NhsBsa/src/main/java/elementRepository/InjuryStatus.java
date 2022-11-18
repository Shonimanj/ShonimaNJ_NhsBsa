package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWait;
import utilities.Generalutilities;

public class InjuryStatus {
	WebDriver driver;
	Generalutilities gu=new Generalutilities();
	ExplicitWait ew=new ExplicitWait();



	public InjuryStatus(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "label-yes")
	WebElement injuryAsYes;
	@FindBy(id="next-button")
	WebElement next7;

	public void injuryStatusAsYes()
	{
		gu.clickOnTheElement(injuryAsYes);
		gu.clickOnTheElement(next7);
	}

}
