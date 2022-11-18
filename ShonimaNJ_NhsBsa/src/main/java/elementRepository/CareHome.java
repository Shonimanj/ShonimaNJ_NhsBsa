package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWait;
import utilities.Generalutilities;

public class CareHome {

	WebDriver driver;
	Generalutilities gu=new Generalutilities();
	ExplicitWait ew=new ExplicitWait();



	public CareHome(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="radio-no")
	WebElement careHomeAsNo;
	@FindBy(id = "next-button")
	WebElement next11;
	
	public void liveInCareHome()
	{
		gu.clickOnTheElement(careHomeAsNo);
		gu.clickOnTheElement(next11);
	}
	
	
}
