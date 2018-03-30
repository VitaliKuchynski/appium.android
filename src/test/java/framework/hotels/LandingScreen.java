package framework.hotels;


import framework.BaseAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LandingScreen extends BaseAction{
    @AndroidFindBy(id = "com.hcom.android:id/btnPositive")
    @iOSFindBy(accessibility = "yesButton")
    private MobileElement yesButton;

    // @AndroidFindBy(className = "android.widget.ImageButton")
    @AndroidFindBy(accessibility = "Open drawer menu")
    private MobileElement mainMenu;

    @AndroidFindBy(id = "com.hcom.android:id/drawer_header_sign_in")
    private MobileElement signInButtonSlideMenu;

    @AndroidFindBy(id = "com.hcom.android:id/hp_hcom_rewards_signin")
    private MobileElement signInButtonLandingScreen;

    @AndroidFindBy(id = "com.hcom.android:id/hp_text_search")
    private MobileElement homePageSearchField;

    @AndroidFindBy(id = "com.hcom.android:id/hp_hcom_rewards_create_account")
    private MobileElement createAccountButton;

    public void tapOnYesButton() {
        tapOn(yesButton);
    }
    //Tabs on Main menu icon
    public void tapOnMainMenuButton() {
        tapOn(mainMenu);
    }
    //Taps on Sign in button in the menu
    public void tapOnSignInButton() {
        tapOn(signInButtonSlideMenu);
    }
    //Verifies is search field is enabled
    public boolean isElementPresent(){
        return  isEnabled(homePageSearchField);
    }

    //Taps on create account button
    public void tapOnCreateAccountButton(){
        tapOn(createAccountButton);
    }
    //Taps on sign in button on landing screen
    public void tapOnSignInButtonLandingScreen(){
        tapOn(signInButtonLandingScreen);
    }

}
