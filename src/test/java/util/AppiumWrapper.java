package util;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumWrapper {

    //Builds a Appium driver
    public static AppiumDriver buildAppiumDriver() {
        AppiumDriver appiumDriver = null;
        String appiumServerURL = "http://0.0.0.0:4723/wd/hub";

        String platformName = "android";
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2"); //old "appium"
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung Galaxy S8");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/vitalikuchynski/IdeaProjects/base.apk");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 30000);

        try {
            appiumDriver = new AndroidDriver(new URL(appiumServerURL), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return appiumDriver;
    }
}


