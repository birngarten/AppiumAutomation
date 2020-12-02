package com.automation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackAndroid {
    AndroidDriver<AndroidElement> driver;

    public static final String USERNAME = "resitozyurt1";
    public static final String AUTOMATE_KEY = "SS2oKWNjxs1QNfUmz1Ys";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    @Test
    public void browserTest() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("browserName", "android");
        caps.setCapability("device", "Samsung Galaxy S10e");
        caps.setCapability("realMobile", "true");
        caps.setCapability("os_version", "9.0");
        caps.setCapability("name", "resitozyurt1's First Test");
        caps.setCapability("app","bs://2b6c05138ae2fcc55cdca79438a9276cb0d28635");

        driver = new AndroidDriver<>(new URL(URL),caps);

//        curl -u "resitozyurt1:SS2oKWNjxs1QNfUmz1Ys" -X POST "https://api-cloud.browserstack.com/app-automate/upload"  -F "file=@C:/Users/Administrator/IdeaProjects/AppiumAutomation/etsy.apk"


    }


}
