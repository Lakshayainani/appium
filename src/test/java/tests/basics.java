package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class basics extends base {

    public static void main(String[] args) throws MalformedURLException {
    AndroidDriver<AndroidElement> driver = capabilities();

    // xpath,id,className,androidUIautomator
    driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
    driver.findElementByXPath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]").click();
    driver.findElementById("android:id/checkbox").click();
    driver.findElementsByXPath("//android.widget.RelativeLayout").get(1).click();
    driver.findElementById("android:id/edit").sendKeys("Hey");
    driver.findElementById("android:id/button1").click();

    }
}
