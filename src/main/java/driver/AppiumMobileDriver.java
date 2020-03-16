package driver;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumMobileDriver {
    private static AndroidDriver driver;

    public static AndroidDriver getAppiumDriver(){
        if (driver == null){
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("appium-version", "1.15.1");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "5.1");
            capabilities.setCapability("deviceName", "L91HVBP424RHT");
            capabilities.setCapability("appPackage", "ru.yandex.market");
            capabilities.setCapability("appActivity", "ru.yandex.market.feature.ui.splash.SplashActivity");
            capabilities.setCapability("newCommandTimeout", 60 * 5);
            try {
                driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            } catch (MalformedURLException error){
                System.out.println("Impossible establish connection with Appium server");
                error.printStackTrace();
            }
        }
        return driver;
    }
}
