package day02;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class C01_set_capabilities {

    @Test
    public void testUiAutomator2Options() throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options()
                // .setApp("C:/Users/nurik/IdeaProjects/apppiumProjet/src/test/resources/ApiDemos-debug.apk")
                .setAppPackage("io.appium.android.apis")
                .setAppActivity("io.appium.android.apis.preference.SwitchPreference")
                // .setUdid("emulator-5554");  // adb devices
                .setAvd("Android10")  //Kapali emilatorun acilmasi icin
                .setAvdLaunchTimeout(Duration.ofMinutes(3)); // extra sure vermek icin

        URL url = new URL(" http://127.0.0.1:4723");

        AndroidDriver driver = new AndroidDriver(url, options);


    }

}
