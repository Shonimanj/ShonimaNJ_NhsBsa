package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWait;
import utilities.Generalutilities;

public class AffectedConditions {
	WebDriver driver;
	Generalutilities gu=new Generalutilities();
	ExplicitWait ew=new ExplicitWait();



	public AffectedConditions(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "label-no")
	WebElement afftectedConditionAsNo;

	@FindBy(id = "next-button")
	WebElement next9;
	public void AfftectedCondtion()
	{
		gu.scrollDown(driver);
		gu.clickOnTheElement(afftectedConditionAsNo);
		ew.explicitWaitMethod(next9, driver);
		gu.clickOnTheElement(next9);
	}

}
