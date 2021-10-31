
// user needs to be logged out for this automation

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;



public class HealineAutomation {


    public static  AndroidDriver driver;

    public static void main (String[] args) throws MalformedURLException, InterruptedException {



        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        dc.setCapability("platformName","android");
        dc.setCapability("appPackage","n1x0nj4.news");
        dc.setCapability("appActivity","n1x0nj4.news.ui.login.LoginActivity");

        System.setProperty("webdriver.http.factory", "apache");

        // AndroidDriver <AndroidElement> ad = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), dc);

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), dc);

        MobileElement el1 = (MobileElement) driver.findElementById("n1x0nj4.news:id/etEmail");
        el1.click();
        el1.sendKeys("kvaternik1997@gmail.com");
        MobileElement el2 = (MobileElement) driver.findElementById("n1x0nj4.news:id/etPassword");
        el2.click();
        el2.sendKeys("dinamo123");
        driver.hideKeyboard();
        MobileElement el3 = (MobileElement) driver.findElementById("n1x0nj4.news:id/bLogin");
        el3.click();

        Thread.sleep(3000);

        MobileElement el4 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"This is news image\"])[2]");
        el4.click();





    }}
