package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;


public class googleStepDef {
	public WebDriver driver;
	public String actT;
	@Given("Browser should get open and application should be launched")
	public void browser_should_get_open_and_application_should_be_launched() {
		driver = new ChromeDriver();
	   driver.get("https://www.google.com");
	}

	@When("User captures Title of google page")
	public void user_captures_title_of_google_page() {
	    actT = driver.getTitle();
	}

	@Then("Expected and Actual Title should match")
	public void expected_and_actual_title_should_match() {
	 if(actT.contains("Google")) {
		 System.out.println("TC is Pass");
	 }
	 else {
		 System.out.println("TC Fail");
	 }
	}

}
