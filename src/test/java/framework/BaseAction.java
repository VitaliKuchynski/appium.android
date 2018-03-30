package framework;


import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static stepdefinition.SharedSD.getAppiumDriver;


public class BaseAction {
    /**
     * This is a constructor which initializes initPageElements()
     */
    public BaseAction() {
        initPageElements();
    }

    /**
     * This method handles wait functionality for mobile actions, which means if the element is not found
     * during test then the app will re-try and wait up to 15 seconds before failing the test step
     */
    protected void initPageElements() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver(), 15, TimeUnit.SECONDS), this);
    }

    /**
     * This method is used to tap on element
     *
     * @param mobileElement element to tap on
     */
    protected void tapOn(MobileElement mobileElement) {
        try {
            if (mobileElement.isEnabled()) {
                mobileElement.click();
            }
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }

    /**
     * This method is used to set value in text field
     *
     * @param mobileElement
     * @param setValue
     */
    protected void setValue(MobileElement mobileElement, String setValue) {

        try {
            mobileElement.sendKeys(setValue);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }
    //Verifies is element enabled
    protected boolean isEnabled(MobileElement mobileElement){
        return mobileElement.isEnabled();
    }
// Example 1
//    public void testScroll()throws Exception
//    {
//        getAppiumDriver().findElementByAccessibilityId("Views").click();
//        AndroidElement list = (AndroidElement) getAppiumDriver().findElement(By.id("android:id/mobile_list"));
//        MobileElement listGroup = list
//                .findElement(MobileBy
//                        .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
//                                + "new UiSelector().text(\" List item:25\"));"));
//        assertNotNull(listGroup.getLocation());
//        listGroup.click();
//    }
// Example 2
//    TouchAction tAction=new TouchAction(SharedSD.getAppiumDriver());
//    int startx = SharedSD.getAppiumDriver().findElement(By.id("com.hcom.android:id/rewards_free_moon_image")).getLocation().getX();
//    int starty = SharedSD.getAppiumDriver().findElement(By.id("com.hcom.android:id/rewards_free_moon_image")).getLocation().getY();
//    int endx = SharedSD.getAppiumDriver().findElement(By.id("com.hcom.android:id/need_a_hotel_message")).getLocation().getX();
//    int endy = SharedSD.getAppiumDriver().findElement(By.id("com.hcom.android:id/need_a_hotel_message")).getLocation().getY();
//       System.out.println(startx + " ::::::: " + starty + " ::::::: " + endx +  " ::::::: " +    endy);
//
//       tAction.press(startx,starty).waitAction(1000).moveTo(endx+20,endy-400).release().perform();
//       UtilHelp.pauseScript(2000);


    //Scrolls to element by string value
    protected void scrollTo(String text) {
        getAppiumDriver().findElement(MobileBy
                .AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\").instance(0))"));
    }



}


