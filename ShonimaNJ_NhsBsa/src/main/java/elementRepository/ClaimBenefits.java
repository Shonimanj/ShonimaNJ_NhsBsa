package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWait;
import utilities.Generalutilities;

public class ClaimBenefits {

	WebDriver driver;
	Generalutilities gu=new Generalutilities();
	ExplicitWait ew=new ExplicitWait();
	public ClaimBenefits(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id ="label-no" )
	WebElement claimBenefitsAsNo;

	@FindBy(id = "next-button")
	WebElement next6;
	@FindBy(id = "label-yes")
	WebElement claimBenefitsAsYes;

	public void claimBenefitsNo()
	{
		gu.clickOnTheElement(claimBenefitsAsNo);
		gu.clickOnTheElement(next6);
	}
	public void claimBenefitsYes()
	{
		gu.clickOnTheElement(claimBenefitsAsYes);
		gu.clickOnTheElement(next6);
	}



}
