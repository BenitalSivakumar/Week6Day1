package stepDefinition;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Steps extends BaseClass {


@When("click create lead")
public void createlead() {
	driver.findElement(By.linkText("Create Lead")).click();

}

@Then("create lead page is displayed")
public void verify() {
	String title = driver.getTitle();
	if (title.equals("Create Lead | opentaps CRM")) {
		System.out.println("create lead title verified");

	} else {
		System.out.println("create lead title not verified");
	}

}
@Given("enter the companyname")
public void enter_the_companyname() {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
}
@Given("enter the firstname")
public void enter_the_firstname() {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
}
@Given("enter the secondnumber")
public void enter_the_secondnumber() {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
}
@Given("enter the phone number")
public void enter_the_phone_number() {
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
}
@When("click the create lead")
public void click_the_create_lead() {
	driver.findElement(By.name("submitButton")).click();
}
@Then("view Lead should be displayed")
public void view_lead_should_be_displayed() {
	String title2 = driver.getTitle();
	if (title2.equals("View Lead | opentaps CRM")) {
		System.out.println("view lead title verified");
		
	}else {
		System.out.println("view lead title is not verified");
	}
	
}


}
