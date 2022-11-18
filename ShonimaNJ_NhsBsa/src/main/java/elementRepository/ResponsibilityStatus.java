package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWait;
import utilities.Generalutilities;

public class ResponsibilityStatus {
	WebDriver driver;
	Generalutilities gu=new Generalutilities();
	ExplicitWait ew=new ExplicitWait();



	public ResponsibilityStatus(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "label-yes")
	WebElement responsibilityStatusasyes;
	@FindBy(id="next-button")
	WebElement next15;
	
	
	public void sesponsibilityStatusAsYes()
	{
		gu.clickOnTheElement(responsibilityStatusasyes);
		gu.clickOnTheElement(next15);
	}
	
}
