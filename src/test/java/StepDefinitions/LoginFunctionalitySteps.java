package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunctionalitySteps {
    DialogContent dc=new DialogContent();
    @Then("The User Click To Login Link")
    public void theUserClickToLoginLink() {
        dc.myClick(dc.loginLink);


    }

    @And("The User Enter The Login Data")
    public void theUserEnterTheLoginData() {
        dc.mySendkeys(dc.loginEmail, "asb@gmail.com");
        dc.mySendkeys(dc.loginPassword, "Ab123456");
    }

    @When("The User Click To Login Button")
    public void theUserClickToLoginButton() {
        dc.myClick(dc.loginButton);
    }

    @Then("The User Verify The Successfully Login")
    public void theUserVerifyTheSuccessfullyLogin() {
        dc.verifyContainsText(dc.verify, "aaa");
    }
}
