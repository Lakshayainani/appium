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

public class swipeDemo extends hybridBase {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver<AndroidElement> driver = capabilities("emulator");
        TouchAction t = new TouchAction(driver);
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        WebElement dw = driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")");
        t.tap(tapOptions().withElement(element(dw))).perform();
        driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
        driver.findElementByXPath("//*[@content-desc='9']").click();
        Thread.sleep(2000);
        WebElement fifteen = driver.findElementByXPath("//*[@content-desc='15']");
        WebElement fortyfive = driver.findElementByXPath("//*[@content-desc='45']");
        t.longPress(longPressOptions().withElement(element(fifteen)).withDuration(Duration.ofSeconds(2))).moveTo(element(fortyfive)).release().perform();

    }
}
