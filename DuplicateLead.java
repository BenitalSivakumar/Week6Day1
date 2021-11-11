package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DuplicateLead extends BaseClass {
	@When("click on duplicate lead")
	public void click_on_duplicate_lead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}
	@Then("duplicate title should be displayed")
public void title() {
		String title = driver.getTitle();
		if (title.equals("Duplicate Lead | opentaps CRM")) {
			System.out.println("duplicate title is verified");
			
		}else {
			System.out.println("duplicate title is not verified");
		}
}}
