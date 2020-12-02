package com.automation;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {

    AndroidDriver<AndroidElement> driver;

    @Before
    public void beforeCalculatorTest() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("platformVersion","7.0");
        desiredCapabilities.setCapability("deviceName","Pixel_2");
        desiredCapabilities.setCapability("appPackage","com.android.calculator2");
        desiredCapabilities.setCapability("appActivity","com.android.calculator2.Calculator");

         driver = new AndroidDriver<>(new URL("http:localhost:4723/wd/hub"),desiredCapabilities);
        Thread.sleep(5000);


    }

    @Test
    public void calculatorTest(){
        WebElement digitEigth = driver.findElement(By.id("digit_8"));
        WebElement multiplyX = driver.findElement(By.id("op_mul"));
        WebElement digitFive = driver.findElement(By.id("digit_5"));
        WebElement equals = driver.findElement(MobileBy.AccessibilityId("equals"));
//        bir yukaridaki satir ile bir asagidaki satirlarindaki locate'ler ayni islevi goruyor.
        WebElement equalsWithId = digitEigth.findElement(By.id("eq"));
        WebElement result = driver.findElement(By.id("result"));

        digitEigth.click();
        multiplyX.click();
        digitFive.click();
        equals.click();

        System.out.println(result.getText());


    }

}
