package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Locators.WalesPerson;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonFunctions {

	
	static WebDriver driver;
	public WalesPerson wp;
	
	public WebDriver BrowserLaunch(WebDriver driver) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
		driver.manage().window().maximize();
		
		wp = new WalesPerson(driver);
		
		return driver;
		
		
		
	}
}
