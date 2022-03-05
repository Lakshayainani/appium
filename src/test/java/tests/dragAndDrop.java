package tests;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.time.Duration;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class dragAndDrop extends hybridBase {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities("emulator");
        TouchAction t=new TouchAction(driver);
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
        WebElement dot1 = driver.findElementsByClassName("android.view.View").get(0);
        WebElement dot2 = driver.findElementsByClassName("android.view.View").get(1);
        t.longPress(longPressOptions().withElement(element(dot1)).withDuration(Duration.ofSeconds(2))).moveTo(element(dot2)).release().perform();
    }
}
