import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumTest {

    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "iOS");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.3.1");
        desiredCapabilities.setCapability("udid", "00008101-000164922669001E");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Sai's iPhone");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
//        desiredCapabilities.setCapability("bundleId"," com.saiashish.WebDriverAgentRunner.xctrunner");
        //desiredCapabilities.setCapability("noReset", "true");
//        desiredCapabilities.setCapability("appPackage", "io.appium.android.apis");
//        desiredCapabilities.setCapability("appActivity", ".ApiDemos");
//        desiredCapabilities.setCapability("avd", "Pixel_2");
//        IF APP IS ALREADY INSTALLED < COMMENT BELOW LINE
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/saiashishdarapureddy/Desktop/folders/IOS Development/XCUIAutomationScripts/XCUIAutomationScripts.ipa");
//      copy and paste the .ipa compress it, right click archive utility, show package identifier => bundle identifier
//
        //        .zip => simulator
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AppiumDriver driver = new AndroidDriver(url, desiredCapabilities);
        String sessionId = driver.getSessionId().toString();
    }

}
