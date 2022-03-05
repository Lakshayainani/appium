package tests;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.time.Duration;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class gestures extends hybridBase {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver<AndroidElement> driver = capabilities("emulator");
        TouchAction t = new TouchAction(driver);
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        WebElement expandList = driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");
        t.tap(tapOptions().withElement(element(expandList))).perform();
        driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
        WebElement peopleName = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
        t.longPress(longPressOptions().withElement(element(peopleName)).withDuration(Duration.ofSeconds(2))).release().perform();
        Thread.sleep(2000);
        System.out.println(driver.findElementById("android:id/title").isDisplayed());

//        findElementByXPath("//android.widget.TextView[@text='People Names']");

    }
}
