package com.automation;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class ChromeTest {

    @Test
    public void test1() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("platformVersion","7.0");
        desiredCapabilities.setCapability("deviceName","Pixel_2");
        desiredCapabilities.setCapability("automationName","UiAutomator2");
        desiredCapabilities.setCapability("browserName","chrome");

        WebDriverManager.chromedriver().version("2.23").setup(); //guncel chrome versiyonu gerekli
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,WebDriverManager.chromedriver().getBinaryPath());
        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
        driver.get("https://www.amazon.com/");

        WebElement amazonSearchBox= driver.findElement(By.xpath("//input[@name='k']"));
        amazonSearchBox.sendKeys("Appium"+ Keys.ENTER);

    }
}
