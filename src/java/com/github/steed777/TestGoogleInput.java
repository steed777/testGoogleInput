/*
package com.github.steed777;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestGoogleInput {
    private WebDriver driver;
    private WebDriverWait wait;
    private WebElement element;

    @Before
    public void startDriver() {
        FirefoxOptions options = new FirefoxOptions();
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver(options);
        wait = new WebDriverWait(driver, 10);
    }
    @Test
    public void testgoogleinput()  {
            driver.get("https://www.google.ru/");
            element = driver.findElement(By.xpath("//input[@title = 'Поиск' ]"));//[name="q"]
            element.sendKeys("купить кофемашину bork c804");
            element.click();
            element.sendKeys(Keys.ENTER);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(), 'BORK C804')]")));//
    }
    @After
    public void stopDriver(){
        driver.quit();
    }
}
*/
