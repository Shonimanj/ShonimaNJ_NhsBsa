package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWait;
import utilities.Generalutilities;

public class PregnantStatus {
	WebDriver driver;
	Generalutilities gu=new Generalutilities();
	ExplicitWait ew=new ExplicitWait();

	public PregnantStatus(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "label-no")
	WebElement PregnantStatusNo;
	@FindBy(id = "next-button")
	WebElement next7;


	public void PregnantStatusAsNo()
	{
		gu.clickOnTheElement(PregnantStatusNo);
		gu.clickOnTheElement(next7);
	}



}

