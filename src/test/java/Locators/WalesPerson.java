package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinitions.Wales_step;
import Utilities.CommonFunctions;

public class WalesPerson {

	public static WebDriver driver;

	public WalesPerson(WebDriver driver) {
		// WalesPerson.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class='button button-get-started']")
	private WebElement SrtNow;

	public WebElement getSrtNow() {
		return SrtNow;
	}

	@FindBy(css = "button#nhsuk-cookie-banner__link_accept_analytics")
	private WebElement OKanalyticsCookies;

	public WebElement getOKanalyticsCookies() {
		return OKanalyticsCookies;
	}

	@FindBy(id = "logo")
	private WebElement LOGO;

	public WebElement getLOGO() {
		return LOGO;
	}

	@FindBy(id = "radio-wales")
	private WebElement livingcountry;

	public WebElement getlivingcountry() {
		return livingcountry;
	}

	@FindBy(id = "next-button")
	private WebElement Nextbutton;

	public WebElement getNextbutton() {
		return Nextbutton;
	}

	/*
	 * @FindBy(id = "//input[@class='button']") private WebElement next; public
	 * WebElement getnext() { return next; }
	 */
	// Entering with all the option Yes

	@FindBy(id = "radio-yes")
	private WebElement gpPracticeInScotlandOrWales;

	public WebElement getgpPracticeInScotlandOrWales() {
		return gpPracticeInScotlandOrWales;
	}

	@FindBy(id = "radio-yes")
	private WebElement denPraCountry;

	public WebElement getdenPraCountry() {
		return denPraCountry;
	}

	@FindBy(id = "dob-day")
	private WebElement DOB_day;

	public WebElement getDOB_day() {
		return DOB_day;
	}

	@FindBy(id = "dob-month")
	private WebElement DOB_month;

	public WebElement getDOB_month() {
		return DOB_month;
	}

	@FindBy(id = "dob-year")
	private WebElement DOB_year;

	public WebElement getDOB_year() {
		return DOB_year;
	}

	@FindBy(id = "paidUniversalCredit")
	private WebElement paid_unicredit;

	public WebElement getpaid_unicredit() {
		return paid_unicredit;
	}

	@FindBy(id = "radio-yes")
	private WebElement YesOption;

	public WebElement getYesOption() {
		return YesOption;
	}

	@FindBy(id = "yes-universal")
	private WebElement paidUniversalCredit;

	public WebElement getpaidUniversalCredit() {
		return paidUniversalCredit;

	}

	@FindBy(id = "not-yet")
	private WebElement notyet;

	public WebElement getnotyet() {
		return notyet;

	}

	@FindBy(id = "question-heading")
	private WebElement questionheading;

	public WebElement getquestionheading() {
		return questionheading;

	}

	@FindBy(id = "taxCredit")
	private WebElement taxCredit;

	public WebElement gettaxCredit() {
		return taxCredit;

	}

	@FindBy(id = "incSupport")
	private WebElement incSupport;

	public WebElement getincSupport() {
		return incSupport;

	}

	@FindBy(id = "esa")
	private WebElement esa;

	public WebElement getesa() {
		return esa;

	}

	@FindBy(id = "jsa")
	private WebElement jsa;

	public WebElement getjsa() {
		return jsa;

	}

	@FindBy(id = "penCredit")
	private WebElement penCredit;

	public WebElement getpenCredit() {
		return penCredit;

	}

	@FindBy(xpath = "//div[@class='done-panel']//h2")
	private WebElement done;

	public WebElement getdone() {
		return done;
	}

	@FindBy(xpath = "//*[@id='content']//li")
	private WebElement NHSHelpList;

	public WebElement getNHSHelpList() {
		return NHSHelpList;
	}

	// Entering will all the option NO

	@FindBy(id = "radio-no")
	private WebElement NoOption;

	public WebElement getNoOption() {
		return NoOption;
	}

	@FindBy(id = "result-heading")
	private WebElement NHSCostHeader;

	public WebElement getNHSCostHeadern() {
		return NHSCostHeader;
	}

	@FindBy(xpath = "//*[@id='result-heading']//span[@class='heading-secondary']")
	private WebElement YougethelpwithNHScosts_Message;

	public WebElement getYougethelpwithNHScosts_Message() {
		return YougethelpwithNHScosts_Message;
	}

	@FindBy(xpath = "//ul[@class='form-hint-list']//li")
	private WebElement Yougetfree_Message;

	public WebElement getYougetfree_Message_Message() {
		return Yougetfree_Message;
	}

	@FindBy(id = "paidUniversalCredit")
	private WebElement inCare_Home;

	public WebElement inCare_Home() {
		return inCare_Home;
	}

	@FindBy(id = "paidUniversalCredit")
	private WebElement have_Savings;

	public WebElement have_Savings() {
		return have_Savings;
	}

	@FindBy(xpath = "(//h1[@class='heading-large'])[1]")
	private WebElement assert_final;

	public WebElement getassert_final() {
		return assert_final;

		// without Entering the DOB
	}

	@FindBy(xpath = "(//*[text()='Enter your date of birth'])[1]")
	private WebElement without_DOB;

	public WebElement getwithout_DOB() {
		return without_DOB;
	}

	// Final Done message
	@FindBy(id = "//*[@class='heading-xlarge done-panel']")
	private WebElement Done_final;

	public WebElement getDone_final() {
		return Done_final;
	}

	// under 18 years
	@FindBy(name = "fullTimeEducation")
	private WebElement fulltime_edu;

	public WebElement getfulltime_edu() {
		return fulltime_edu;
	}

	// over 122 years
	@FindBy(xpath = "//li[@class='error-message']")
	private WebElement DOB_error;
	public   WebElement getDOB_error() {
	     return DOB_error;
	}

	@FindBy(id = "error-summary-heading")
	private WebElement problem_error;
	public WebElement getproblem_error() {
		return problem_error;
	}
	
	@FindBy(xpath = "//*[@id='error-summary']//li//a//span")
	private WebElement getEmptyDOB_error;
	public WebElement getEmptyDOB_error() {
		return getEmptyDOB_error;
	}
}
