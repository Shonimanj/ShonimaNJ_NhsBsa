package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWait;
import utilities.Generalutilities;

public class GpPractice {
	WebDriver driver;
	Generalutilities gu=new Generalutilities();
	ExplicitWait ew=new ExplicitWait();
	public GpPractice(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id ="label-yes")
	WebElement gppracticeYes;
	@FindBy(id = "next-button")
	WebElement next2;

	public void clickOnGpPracticeYes()
	{
		gu.clickOnTheElement(gppracticeYes);
		gu.clickOnTheElement(next2);
	}



}
