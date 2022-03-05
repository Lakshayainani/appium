package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class uiAutomator extends hybridBase {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities("emulator");

        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

//        check element is clickable
        int size =driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size();
        System.out.println(size);

    }
}
