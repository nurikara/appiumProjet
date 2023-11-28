package day02;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AndroidBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class C02_locaters {

    @Test
    public void testUiAutomator2Options() throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options()
                 .setApp("C:/Users/nurik/IdeaProjects/apppiumProjet/src/test/resources/ApiDemos-debug.apk")
               // .setAppPackage("io.appium.android.apis")
              //  .setAppActivity("io.appium.android.apis.preference.SwitchPreference")
                // .setUdid("emulator-5554");  // adb devices
                .setAvd("Android10")  //Kapali emilatorun acilmasi icin
                .setAvdLaunchTimeout(Duration.ofMinutes(3)); // extra sure vermek icin

        URL url = new URL(" http://127.0.0.1:4723");

        AndroidDriver driver = new AndroidDriver(url, options);
// 1) accessibilityId
        WebElement element = driver.findElement(AppiumBy.accessibilityId("Content"));

        System.out.println("accessibilityId = " + element.getText());
// 2) id
        element = driver.findElements(AppiumBy.id("android:id/text1")).get(3);

        System.out.println("Id = " + element.getText());

// 3) class
       element= driver.findElements(AppiumBy.className("android.widget.TextView")).get(5);
        System.out.println("class = " + element.getText());

// 4) uiautomator
        element=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Preference\")"));

        System.out.println("uiautomator = " + element.getText());

        // 5) xpath selection

       element = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Preference\"]"));
       element = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Preference\"]"));

        System.out.println("xpath = " + element.getText());


    }

}
