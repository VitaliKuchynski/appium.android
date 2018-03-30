package stepdefinition;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import org.testng.Assert;
import util.AppiumWrapper;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class SharedSD {

    private static AppiumDriver appiumDriver;
    /**
     * This method initializes the appium driver object on default mobile device specified in the config file
     *
     * @throws MalformedURLException
     */
    @Before
    private static void intializeAppiumDriver() throws MalformedURLException {
        appiumDriver = AppiumWrapper.buildAppiumDriver();

        // This is used in cases where fluent wait is not applied (fluentWait() at BaseWebPage class)
        appiumDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    /**
     * This method is used to quit the Appium driver if it is not null
     */
    @After
    public static void quitAppiumDriver() {
        if (appiumDriver != null) {
            System.out.println("Quitting Appium..");
            appiumDriver.quit();
            System.out.println("Quitting Appium - Done");
            appiumDriver = null;
        }
    }
    /**
     * This will start an Appium server and return an Appium driver (or initialize it if it's not initialized)
     * Only 1 driver and server will be started/initialized per run
     *
     * @return Appium driver
     */
    public static AppiumDriver getAppiumDriver() {
        if (appiumDriver == null) {
            try {
                // Initialize the appium server the first time the driver is created

                // the start appium server may be called mulitple times, since only 1 instance is created
                intializeAppiumDriver();
            } catch (MalformedURLException e) {
                Assert.fail("Unable to initialize Appium driver due to invalid Server URL or there server is already in use");

            }
        }

        return appiumDriver;
    }
}



