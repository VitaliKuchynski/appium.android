package framework.hotels;


import framework.BaseAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginScreen extends BaseAction{
    @AndroidFindBy(id = "com.hcom.android:id/txt_sign_in_email_address")
    private MobileElement emailTextField;

    @AndroidFindBy(id = "com.hcom.android:id/txt_sign_in_password")
    private MobileElement passwordTextField;

    @AndroidFindBy(id = "com.hcom.android:id/aut_sig_p_signin_btn_sign_in")
    private MobileElement signInButton;

    //Enters text to email field
    public void enterEmailAddress(String email) {
        setValue(emailTextField, email);
    }
    //Enters password to password input field
    public void enterPassword(String password) {
        setValue(passwordTextField, password);
    }
    //Taps on sign in button
    public void tapOnSignInButton() {
        tapOn(signInButton);
    }

}
