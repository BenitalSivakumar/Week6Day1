package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends BaseClass{

	
	@When("click find lead")
	public void click_find_lead() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@When("click phone")
	public void click_phone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@Given("enter the phone")
	public void enter_the_phone() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
	}
	@When("click find leads")
	public void click_find_leads() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	@When("click on the first lead")
	public void click_on_the_first_lead() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@Then("view lead should be displayed")
	public void view_lead_should_be_displayed() {
		String title2 = driver.getTitle();
		if (title2.equals("View Lead | opentaps CRM")) {
			System.out.println("view lead title verified");
			
		}else {
			System.out.println("view lead title is not verified");
		}
	}
	@When("click the edit button")
	public void click_the_edit_button() {
		driver.findElement(By.linkText("Edit")).click();
	}
	@Then("title should be displayed")
	public void title_should_be_displayed() {
		String title2 = driver.getTitle();
		if (title2.equals("opentaps CRM")) {
			System.out.println("edit title verified");
			
			
		}else {
			System.out.println("edit title not verified");
		}
	}
	@Given("change the company name")
	public void change_the_company_name() {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
	}
	@When("click update")
	public void click_update() {
		driver.findElement(By.name("submitButton")).click();
	}
}
