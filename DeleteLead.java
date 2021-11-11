package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;

public class DeleteLead extends BaseClass{
	@When("click delete lead")
	public void delete() {
		driver.findElement(By.linkText("Delete")).click();
}
}