package HomeWork;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class HW02 {
    @Test
    public void testUiAutomator2Options() throws MalformedURLException {
        String appUrl = System.getProperty("user.dir")
                + File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources"
                + File.separator + "ApiDemos-debug.apk";


        UiAutomator2Options options = new UiAutomator2Options()


                .setApp(appUrl);
        //.setAppPackage("io.appium.android.apis").setAppActivity("io.appium.android.apis.preference.SwitchPreference");
        // .setUdid("emulator-5554");

        URL url = new URL(" http://127.0.0.1:4723");

        AndroidDriver driver = new AndroidDriver(url, options);

        WebElement element = driver.findElement(AppiumBy.accessibilityId("Accessibility"));
        element.click();

        element = driver.findElement(AppiumBy.accessibilityId("Accessibility Node Provider"));
        System.out.println("Accessibility Node Provider= " + element.getText());

//        element = driver.findElement(AppiumBy.accessibilityId("Accessibility Node Querying"));
//        System.out.println("Accessibility Node Querying = " + element.getText());
//
//        element = driver.findElement(AppiumBy.accessibilityId("Accessibility Service"));
//        System.out.println("Accessibility Service = " + element);
//
//        element = driver.findElement(AppiumBy.accessibilityId("Custom View"));
//        System.out.println("Custom View = " + element);
//
//
//        driver.navigate().back();


    }

}
