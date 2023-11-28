package day01;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class C01_SetDriver {

    @Test

    public void testDesiredCapabilities() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android");
        //capabilities.setCapability("app", "C:\\Users\\nurik\\IdeaProjects\\apppiumProjet\\src\\test\\resources\\ApiDemos-debug.apk");
        capabilities.setCapability("automationName", "uiautomator2");
        // capabilities.setCapability("udid","emulator-5554");
        capabilities.setCapability("appPackage", "com.google.android.calculator");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

        URL url = new URL(" http://127.0.0.1:4723");

        AndroidDriver driver = new AndroidDriver(url, capabilities);
    }

    @Test
    public void testUiAutomator2Options() throws MalformedURLException {
        String appUrl = System.getProperty("user.dir")
                + File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources"
                + File.separator + "ApiDemos-debug.apk";


                UiAutomator2Options options = new UiAutomator2Options()


                 .setApp(appUrl)
                .setAppPackage("io.appium.android.apis").setAppActivity("io.appium.android.apis.preference.SwitchPreference");
        // .setUdid("emulator-5554");

        URL url = new URL(" http://127.0.0.1:4723");

        AndroidDriver driver = new AndroidDriver(url, options);


    }


}
