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
//        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.3.1");
        desiredCapabilities.setCapability("udid", "00008101-000164922669001E");
//        desiredCapabilities.setCapability("udid", "EBDA7F9A-95AF-4A37-A04E-2FCF311E2AEC");

        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Sai's iPhone");
//        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 13");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
//        desiredCapabilities.setCapability("bundleId"," com.saiashish.WebDriverAgentRunner.xctrunner");
        //desiredCapabilities.setCapability("noReset", "true");
//        desiredCapabilities.setCapability("appPackage", "io.appium.android.apis");
//        desiredCapabilities.setCapability("appActivity", ".ApiDemos");
//        desiredCapabilities.setCapability("avd", "Pixel_2");
//        IF APP IS ALREADY INSTALLED < COMMENT BELOW LINE
//        desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/saiashishdarapureddy/Desktop/folders/IOS Development/XCUIAutomationScripts/XCUIAutomationScripts.ipa");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/saiashishdarapureddy/Desktop/folders/IOS Development/XCUIAutomationScripts/XCUIAutomationScriptsUITest.zip");
//        desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/saiashishdarapureddy/Desktop/folders/IOS Development/XCUIAutomationScripts/build/Release-iphonesimulator/XCUIAutomationScripts.zip"); // .app
//        desiredCapabilities.setCapability(MobileCapabilityType.APP,"/Users/saiashishdarapureddy/Library/Developer/Xcode/DerivedData/XCUIAutomationScripts-aqsolsfgsvvjtgefwibjhgovxwir/Build/Products/Debug-iphoneos/XCUIAutomationScriptsUITests-Runner.app");
//      copy and paste the .ipa compress it, right click archive utility, show package identifier => bundle identifier
//
        //        .zip => simulator
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AppiumDriver driver = new AndroidDriver(url, desiredCapabilities);
        String sessionId = driver.getSessionId().toString();
    }

}
