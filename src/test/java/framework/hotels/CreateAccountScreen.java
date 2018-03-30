package framework.hotels;


import framework.BaseAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CreateAccountScreen extends BaseAction{

    //Initialises email adress field locator
    @AndroidFindBy(id = "com.hcom.android:id/txt_register_1_email_address")
    private MobileElement emailImputField;

    //Initialises email adress field locator
    @AndroidFindBy(id = "com.hcom.android:id/txt_register_1_email_address_confirm")
    private MobileElement confirmEmailImputField;

    @AndroidFindBy(id = "com.hcom.android:id/txt_register_1_first_name")
    private MobileElement firstNameInputField;

    @AndroidFindBy(id = "com.hcom.android:id/txt_register_1_last_name")
    private MobileElement lastNameInputField;

    @AndroidFindBy(id = "com.hcom.android:id/txt_register_1_address1")
    private MobileElement adressInputField;

    @AndroidFindBy(id = "com.hcom.android:id/txt_register_1_city")
    private MobileElement cityInputField;

    @AndroidFindBy(id = "com.hcom.android:id/register_1_submit")
    private MobileElement next2StepButton;

    @AndroidFindBy(id = "com.hcom.android:id/register_2_submit")
    private MobileElement submitButton;

    @AndroidFindBy(id = "com.hcom.android:id/register_2_password")
    private MobileElement createPasswordInputField;

    @AndroidFindBy(id = "com.hcom.android:id/register_2_confirm_password")
    private MobileElement confirmPasswordInputField;

    @AndroidFindBy(id = "com.hcom.android:id/register_2_tc_privacy_agree")
    private MobileElement privacyPolicyCheckbox;

    @AndroidFindBy(id = "com.hcom.android:id/alertMessage")
    private MobileElement allertMessage;

    //Fills out all required fields on create account page
    public void fillOutRequiredField(){
        setValue(emailImputField,"grisha@tut.by");
        setValue(confirmEmailImputField,"grisha@tut.by");
        setValue(firstNameInputField,"Grisha");
        setValue(lastNameInputField,"Grisha");
        setValue(adressInputField,"123 Forest planet");
        setValue(cityInputField,"New York");
    }
    //Tans to Next step button
    public void tapOnNextStepButton(){
        tapOn(next2StepButton);
    }

    //Scrolls to element by text parameter
    public void scrollToNext2StepButton(){
        scrollTo("Next: Step 2");
    }
    //Scrolls page to submit button
    public void scrollSubmitButton(){
        scrollTo("Submit");
    }

    //Taps on Submit button
    public void tapOnSubmitButton(){
        tapOn(submitButton);
    }
    //Creates new password
    public void createPassword(){
        setValue(createPasswordInputField,"123hotels");
        setValue(confirmPasswordInputField,"123hotels");
    }
    //Selects privacy policy check box
    public void selectPrivacyAgreementCheckBox(){
        tapOn(privacyPolicyCheckbox);
    }

    //Verifies is alert-message is enabled
    public boolean isAlertMessageEnabled(){
        return isEnabled(allertMessage);
    }

}
