package stepDefinition;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import elementRepository.AffectedConditions;
import elementRepository.CareHome;
import elementRepository.ClaimBenefits;
import elementRepository.Country;
import elementRepository.DateOfBirth;
import elementRepository.Dental;
import elementRepository.DiabeticsStatus;
import elementRepository.GlaucomaStatus;
import elementRepository.GpPractice;
import elementRepository.HomePay;
import elementRepository.InjuryStatus;
import elementRepository.ParnterStatus;
import elementRepository.PregnantStatus;
import elementRepository.ResponsibilityStatus;
import elementRepository.SavingStatus;
import elementRepository.Startpage;
import elementRepository.UniversalCredit;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import utilities.ScreenShot;

public class StartPageTestCases  {
	WebDriver driver;
	Startpage sp;
	Country cu;
	GpPractice gp;
	Dental de;
	DateOfBirth db;
	ParnterStatus ps;
	ClaimBenefits cb;
	PregnantStatus pr;
	InjuryStatus is;
	DiabeticsStatus ds;
	AffectedConditions ac;
	GlaucomaStatus gc;
	CareHome ch;
	SavingStatus ss;
	UniversalCredit uc;
	ResponsibilityStatus re;
	HomePay hp;
	Scenario sa;
	ScreenShot sr;

	@Before
	public void browserSetup(Scenario sa) throws IOException
	{ 
		this.sa=sa;
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
		driver.manage().window().maximize();
	}
	@After
	public void browserClosing(Scenario sa) throws IOException
	{
		sr=new ScreenShot();
		this.sa=sa;
		sr.captureScreenshot(driver);
		driver.close();
		driver.quit();
		
		
		
	}
	@Given("I am uk citizen click startNOw")
	public void i_am_uk_citizen_click_start_n_ow() {
		sp= new Startpage(driver);
		sp.clickOnStartNow();
	}

	@When("user navigate to Country page,select country as England click next")
	public void user_navigate_to_country_page_select_country_as_england_click_next() {
		cu=new Country(driver);
		cu.clickOnCookiesOK();
		cu.clickOnEngland();
		cu.clickonNextButtonInCountry();
	}

	@And("user on GP page select as yes")
	public void user_on_gp_page_select_as_yes() {
		gp=new GpPractice(driver);
		gp.clickOnGpPracticeYes();

	}

	@And("select dental practice as england ,click on next button")
	public void select_dental_practice_as_england_click_on_next_button() {
		de=new Dental(driver);
		de.clickonDentalCountryAsEngland();
		de.nextButton();

	}
	@And("enter date  {string} month {string} and year  {string}  click on next")
	public void enter_date_of_birth_click_on_next_and_and(String dateofbirth, String dateOfMonth, String dateOfYear) {
		db=new DateOfBirth(driver);
		db.enterDob(dateofbirth, dateOfMonth, dateOfYear);

	}
	@And("select live with partner as yes ,click on next button")
	public void liveWithPartner()
	{
		ps=new ParnterStatus(driver);
		ps.clickONliveWithPartneryes();

	}
	@And("select ClaimBenefits as No and click on next")
	public void taxclaimBenefitsNo()
	{
		cb=new ClaimBenefits(driver);
		cb.claimBenefitsNo();

	}
	@And("select your preganent as No and click on next")
	public void preganentStatus() 
	{
		pr=new PregnantStatus(driver);
		pr.PregnantStatusAsNo();

	}
	@And("select your injury status as Yes and click on next")
	public void injuryStatus()

	{
		is=new InjuryStatus(driver);
		is.injuryStatusAsYes();

	}
	@And("select your diabetics status as Yes and click on next")
	public void yourDiabeticsStatus()
	{
		ds=new DiabeticsStatus(driver);
		ds.diabetics();
	}
	@And("select your afftected condition status as No and click on next")
	public void afftectedConditionsStatus()
	{
		ac=new AffectedConditions(driver);
		ac.AfftectedCondtion();

	}

	@And("select your glaucoma condition status as No and click on next")
	public void glaucoma()
	{
		gc=new GlaucomaStatus(driver);
		gc.StatusOfGlauma();
	}
	@And("select your care home live in status as No and click on next")
	public void liveInCareHomeAsNO()
	{
		ch=new CareHome(driver);
		ch.liveInCareHome();
	}
	@And("select your saving status as No and click on next")
	public void savingAsNo()
	{
		ss=new SavingStatus(driver);
		ss.savingStatusAsNo();
	}

	@And("select ClaimBenefits as Yes and click on next")
	public void ClaimBenefitsAsYes() {
		cb=new ClaimBenefits(driver);
		cb.claimBenefitsYes();

	}

	@And("select universal credit as Yes and click on next")
	public void select_universal_credit_as_yes_and_click_on_next() {
		uc=new UniversalCredit(driver);
		uc.clickOnUnversalCreditAsYes();
	}

	@And("select responsibity status as Yes and click on next")
	public void select_responsibity_status_as_yes_and_click_on_next() {
		re=new ResponsibilityStatus(driver);
		re.sesponsibilityStatusAsYes();
	}

	@And("select your take home pay status as Yes and click on next")
	public void select_your_take_home_pay_status_as_yes_and_click_on_next() {
		hp=new HomePay(driver);
				hp.clickOnhomepayAsYes();
	}

	@Then("Check outcomes")
	public void check_outcomes() {
		boolean actual=driver.getPageSource().contains("help");
		boolean expected=true;
		Assert.assertEquals( expected, actual);

	}





}
