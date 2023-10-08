package StepDefinitions;

import Pages.DialogContent;
import Pages.Parent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Random;

public class CreateANewAccountSteps {

    DialogContent dc=new DialogContent();
    @Given("Navigate To AkAkce")
    public void navigateToAkAkce() {
        GWD.getDriver().get("https://www.akakce.com/");
    }

    @When("Click To Create A Account")
    public void clickToCreateAAccount() {
        dc.myClick(dc.createAccountLink);

    }

    @Then("Enter The Account Data")
    public void enterTheAccountData() throws InterruptedException {
        dc.mySendkeys(dc.firstNameInput, "aaaaaa");
        dc.mySendkeys(dc.lastNameInput, "bbbb");
        dc.mySendkeys(dc.email1Input, "asb@gmail.com");
        dc.mySendkeys(dc.email2Input, "asb@gmail.com");
        dc.mySendkeys(dc.password1Input, "Ab123456");
        dc.mySendkeys(dc.password2Input, "Ab123456");

        int randomPick=Parent.randomSecim(1);
        WebElement product=dc.GenderChoise.get(randomPick);
        dc.myClick(product);
        dc.mySelectIndex(dc.selectCity1, 3);
        dc.mySelectIndex(dc.selectCity2, 4);
        dc.mySelectIndex(dc.BirthDay, 4);
        dc.mySelectIndex(dc.BirthMonth, 7);
        dc.mySelectIndex(dc.BirthYear, 6);
        dc.myClick(dc.IAgree);
        dc.myClick(dc.CreateAccountButton);


    }


    @And("The User Should Create The Account Successfully")
    public void theUserShouldCreateTheAccountSuccessfully() {
        dc.verifyContainsText(dc.verify, "aa");
    }
}
