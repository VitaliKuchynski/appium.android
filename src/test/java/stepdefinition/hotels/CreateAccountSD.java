package stepdefinition.hotels;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.hotels.CreateAccountScreen;
import framework.hotels.LandingScreen;
import framework.hotels.LoginScreen;
import org.testng.Assert;

public class CreateAccountSD {

    LandingScreen landingScreen = new LandingScreen();
    CreateAccountScreen createAccountScreen = new CreateAccountScreen();
    LoginScreen loginScreen = new LoginScreen();

    @Given("^I am on hotel app home page$")
    public void iAmOnHotelAppHomePage() {
        landingScreen.tapOnYesButton();
        Assert.assertEquals(landingScreen.isElementPresent(),true);
    }

    @When("^I scroll down page$")
    public void iScrollDown(){
   //?????
    }

    @And("^I tap on (Create Account|Sign in) button$")
    public void iTapOnCreateAccountButton(String button) {
        switch (button){
            case "Create Account":
            landingScreen.tapOnCreateAccountButton();
            break;
            case "Sign in":
            landingScreen.tapOnSignInButtonLandingScreen();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
        }
    }


    @And("^I fill out all required fields$")
    public void iFillOutAllRequiredFields() {
        createAccountScreen.fillOutRequiredField();
        createAccountScreen.scrollToNext2StepButton();
        createAccountScreen.tapOnNextStepButton();
        createAccountScreen.scrollSubmitButton();
        createAccountScreen.createPassword();
    }

    @And("^I submit the form$")
    public void iSubmitTheForm() {
        createAccountScreen.selectPrivacyAgreementCheckBox();
        createAccountScreen.tapOnSubmitButton();
    }

    @Then("^I verify successful creation of a home page$")
    public void verifySuccessfulCreationOfAHomePage() {
        Assert.assertEquals(createAccountScreen.isAlertMessageEnabled(),true);
    }

    @And("^I enter (.+) invalid to (username|password) field$")
    public void iEnterCredential(String text,String filed) {
        switch (filed){
            case "username":
            loginScreen.enterEmailAddress(text);
                break;
            case "password":
            loginScreen.enterPassword(text);
            loginScreen.tapOnSignInButton();
                break;
        }
    }
    @Then ("^I verify invalid error message$")
    public void verifyInvalidError(){
        //?????? version alert
    }
}



