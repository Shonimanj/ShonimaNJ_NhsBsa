package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWait;
import utilities.Generalutilities;

public class DiabeticsStatus {
	WebDriver driver;
	Generalutilities gu=new Generalutilities();
	ExplicitWait ew=new ExplicitWait();



	public DiabeticsStatus(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "label-no")
	WebElement diabeticsAsNo;
	@FindBy(id = "next-button")
	WebElement next8;

	public void diabetics()
	{
		gu.clickOnTheElement(diabeticsAsNo);
		gu.clickOnTheElement(next8);
	}
}
