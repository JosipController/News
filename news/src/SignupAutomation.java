import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.MalformedURLException;
import java.net.URL;

public class SignupAutomation {



    public static void main (String[] args) throws MalformedURLException {


        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        dc.setCapability("platformName","android");
        dc.setCapability("appPackage","n1x0nj4.news");
        dc.setCapability("appActivity","n1x0nj4.news.ui.login.LoginActivity");

        AndroidDriver <AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);


        MobileElement el1 = (MobileElement) ad.findElementById("n1x0nj4.news:id/tvNoAccount");
        el1.click();
        MobileElement el2 = (MobileElement) ad.findElementById("n1x0nj4.news:id/etEmail");
        el2.click();
        el2.sendKeys("test@test.com");
        MobileElement el3 = (MobileElement) ad.findElementById("n1x0nj4.news:id/etPassword");
        el3.click();
        el3.sendKeys("test");
        ad.hideKeyboard();
        MobileElement el4 = (MobileElement) ad.findElementById("n1x0nj4.news:id/bSignup");
        el4.click();





    }
}
