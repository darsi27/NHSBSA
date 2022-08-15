package StepDefinitions;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Locators.WalesPerson;
import Utilities.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Wales_step {

	public static WebDriver driver;
	CommonFunctions cf;
	WalesPerson wp;

	@Given("navigate to the URL")
	public void navigate_to_the_url() {

		cf = new CommonFunctions();
		driver = cf.BrowserLaunch(driver); // Launching the browser

	}

	@Then("accept the cookies")
	public void accept_the_cookies() {
		wp = new WalesPerson(driver); // passing the driver to the Page objects
		wp.getLOGO().isDisplayed(); // Verifying NHS Logo displayed in this page
		wp.getOKanalyticsCookies().click(); // Clicking on the Analytics accepting cookies
		System.out.println("Analytics Cookies Accepted");

	}

	@Given("click Strat Now button")
	public void click_strat_now_button() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", wp.getSrtNow()); // Scrolling down to start now button
		wp.getSrtNow().click(); // Clicking on the start button

	}

	@Then("User selects Wales Country Option and clicks on Next button")
	public void user_selects_wales_country_option_and_clicks_on_next_button() {

		wp.getlivingcountry().click();
		wp.getNextbutton().click();
	}

	@Then("User select Yes for GP practice in Wales and clicks on Next button")
	public void user_select_yes_for_gp_practice_in_wales_and_clicks_on_next_button() {

		wp.getgpPracticeInScotlandOrWales().click();
		wp.getNextbutton().click();
	}

	@Then("User select wales for Dental practice and clicks on Next button")
	public void user_select_wales_for_dental_practice_and_clicks_on_next_button() {
		wp.getlivingcountry().click();
		wp.getNextbutton().click();

	}

	@Then("User Enters the valid date of birth Year {string} and clicks on Next button")
	public void user_enters_the_valid_date_of_birth_year_and_clicks_on_next_button(String Year) {

		wp.getDOB_day().sendKeys("15");
		wp.getDOB_month().sendKeys("05");
		wp.getDOB_year().sendKeys(Year);
		wp.getNextbutton().click();
		
	}



	
	@Then("User click Yes for Do you live with a partner")
	public void user_click_yes_for_do_you_live_with_a_partner() {

		wp.getYesOption().click();
		wp.getNextbutton().click();
	}

	@Then("User click Yes for Do you or your partner claim any benefits or tax credits  and clicks on Next button")
	public void user_click_yes_for_do_you_or_your_partner_claim_any_benefits_or_tax_credits_and_clicks_on_next_button() {

		wp.getYesOption().click();
		wp.getNextbutton().click();
	}

	@Then("User selects Yes for Do you or your partner get paid Universal Credit  and clicks on Next button")
	public void user_selects_yes_for_do_you_or_your_partner_get_paid_universal_credit_and_clicks_on_next_button() {

		wp.getpaidUniversalCredit().click();
		wp.getNextbutton().click();
	}

	@Then("select Yes for As part of your joint Universal Credit, do you have any of these and clicks on Next button")
	public void select_yes_for_as_part_of_your_joint_universal_credit_do_you_have_any_of_these_and_clicks_on_next_button() {

		wp.getYesOption().click();
		wp.getNextbutton().click();
	}

	@Then("click Yes for take-home pay  and clicks on Next button")
	public void click_yes_for_take_home_pay_and_clicks_on_next_button() {
		wp.getYesOption().click();
		wp.getNextbutton().click();

	}

	@Then("Assert Yes Option NHS help list displayed for the user")
	public void assert_yes_option_nhs_help_list_displayed_for_the_user() {

		wp.getdone().isDisplayed();

		List<WebElement> li = driver.findElements(By.xpath("//*[@id='content']//li")); // printing the list of NHS help
		for (WebElement l : li) {
			System.out.println("Message ----> " + l.getText());
		}

	}

	@Then("Assert No Option NHS help list displayed for the user")
	public void assert_no_option_nhs_help_list_displayed_for_the_user() {

		System.out.println("Message ----> " + wp.getYougethelpwithNHScosts_Message().getText());
		System.out.println("Message ----> " + wp.getYougetfree_Message_Message().getText());

	}

	@Then("close the Browser")
	public void close_the_browser() {

		driver.quit();

	}

	// tag2
	@Then("User click No for Do you live with a partner and clicks on Next button")
	public void user_click_no_for_do_you_live_with_a_partner_and_clicks_on_next_button() {

		wp.getNoOption().click();
		wp.getNextbutton().click();
	}

	@Then("User click No for Do you or your partner claim any benefits or tax credits  and clicks on Next button")
	public void user_click_no_for_do_you_or_your_partner_claim_any_benefits_or_tax_credits_and_clicks_on_next_button() {

		wp.getNoOption().click();
		wp.getNextbutton().click();
	}

	@Then("User select No Are you pregnant or have you given birth in the last {int} month and clicks on Next button")
	public void user_select_no_are_you_pregnant_or_have_you_given_birth_in_the_last_month_and_clicks_on_next_button(
			Integer int1) {
		wp.getNoOption().click();
		wp.getNextbutton().click();
	}

	@Then("User select No for Do you have an injury or illness caused by serving in the armed forces and clicks on Next button")
	public void user_select_no_for_do_you_have_an_injury_or_illness_caused_by_serving_in_the_armed_forces_and_clicks_on_next_button() {
		wp.getNoOption().click();
		wp.getNextbutton().click();
	}

	@Then("User select No for Do you have diabetes and clicks on Next button")
	public void user_select_no_for_do_you_have_diabetes_and_clicks_on_next_button() {
		wp.getNoOption().click();
		wp.getNextbutton().click();
	}

	@Then("User select No for Do you have glaucoma and clicks on Next button")
	public void user_select_no_for_do_you_have_glaucoma_and_clicks_on_next_button() {

		wp.getNoOption().click();
		wp.getNextbutton().click();
	}

	@Then("User select No for Do you live permanently in a care home and clicks on Next button")
	public void user_select_no_for_do_you_live_permanently_in_a_care_home_and_clicks_on_next_button() {

		wp.getNoOption().click();
		wp.getNextbutton().click();
	}

	@Then("User selct No for Do you have more than £{double} in savings, investments or property and clicks on Next button")
	public void user_selct_no_for_do_you_have_more_than_£_in_savings_investments_or_property_and_clicks_on_next_button(
			Double double1) {

		wp.getNoOption().click();
		wp.getNextbutton().click();
	}

	// tag3

	@Then("User selects Not yet for Do you or your partner get paid Universal Credit  and clicks on Next button")
	public void user_selects_not_yet_for_do_you_or_your_partner_get_paid_universal_credit_and_clicks_on_next_button() {

		wp.getnotyet().click();
		wp.getNextbutton().click();
	}

	@When("While you and your partner are waiting on a Universal Credit decision and Click on Next button")
	public void while_you_and_your_partner_are_waiting_on_a_universal_credit_decision_and_click_on_next_button() {

		if (wp.getquestionheading().isDisplayed()) {
			wp.getNextbutton().click();
		} else {
			Assert.fail("Technical Error");
		}
	}
	

	@Then("user selects all checkbox in Do you or your partner get any of these benefits and click on Next button")
	public void user_selects_all_checkbox_in_do_you_or_your_partner_get_any_of_these_benefits_and_click_on_next_button() {
		
		//selecting all checkboxes
		wp.gettaxCredit().click();
		wp.getincSupport().click();
		wp.getesa().click();
		wp.getjsa().click();
		wp.getpenCredit().click();
		wp.getNextbutton().click();


	}

	//tag 5
	
	/*
	 * @Then("User select Yes for Are you in full-time education") public void
	 * user_select_yes_for_are_you_in_full_time_education() {
	 * 
	 * wp.getYesOption().click(); wp.getNextbutton().click(); }
	 */


	@Then("Assert Valid error Message when user enter age more than {int}")
	public void assert_valid_error_message_when_user_enter_age_more_than(Integer int1) {
			
		if (wp.getproblem_error().isDisplayed()) {
			System.out.println("DOB Error message " +wp.getDOB_error().getText());
		}
		else {
			Assert.fail("Technical Error");
		}
	}


	//tag7
	@Then("Assert Valid error Message displayed for not Entering your date of birth Message")
	public void assert_valid_error_message_displayed_for_not_entering_your_date_of_birth_message() {

		
		if (wp.getproblem_error().isDisplayed()) {
			System.out.println("DOB Error message ----> " +wp.getEmptyDOB_error().getText());
		}
		else {
			Assert.fail("Technical Error");
		}
	}


//tag8

	@Then("User select Yes for Are you in full-time education and clicks on Next button")
	public void user_select_yes_for_are_you_in_full_time_education_and_clicks_on_next_button() {

		
		wp.getYesOption().click();
		wp.getNextbutton().click();

	}
	@Then("User select No for Are you in full-time education and clicks on Next button")
	public void user_select_no_for_are_you_in_full_time_education_and_clicks_on_next_button() {

		
		wp.getNoOption().click();
		wp.getNextbutton().click();

	}
	
	@Then("User select No for Do you live with a partner and clicks on Next button")
	public void user_select_no_for_do_you_live_with_a_partner_and_clicks_on_next_button() {

		wp.getNoOption().click();
		wp.getNextbutton().click();
	}
	
	@Then("User select No for Do you claim any benefits or tax credits and clicks on Next button")
	public void user_select_no_for_do_you_claim_any_benefits_or_tax_credits_and_clicks_on_next_button() {

		wp.getNoOption().click();
		wp.getNextbutton().click();
	}
	
	
	@Then("User select No for Are you pregnant or have you given birth in the last {int} months and clicks on Next button")
	public void user_select_no_for_are_you_pregnant_or_have_you_given_birth_in_the_last_months_and_clicks_on_next_button(Integer int1) {

		wp.getNoOption().click();
		wp.getNextbutton().click();
		
	}
	
	
	@Then("User select No Do you have an injury or illness caused by serving in the armed forces and clicks on Next button")
	public void user_select_no_do_you_have_an_injury_or_illness_caused_by_serving_in_the_armed_forces_and_clicks_on_next_button() {

		wp.getNoOption().click();
		wp.getNextbutton().click();
	}
	
	
	@Then("User selct No Do you have more than £{double} in savings, investments or property and clicks on Next button")
	public void user_selct_no_do_you_have_more_than_£_in_savings_investments_or_property_and_clicks_on_next_button(Double double1) {

		wp.getNoOption().click();
		wp.getNextbutton().click();
	}
	



}