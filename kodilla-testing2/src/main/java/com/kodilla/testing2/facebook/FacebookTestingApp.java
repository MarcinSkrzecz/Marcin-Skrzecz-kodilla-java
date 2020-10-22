package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String ACCEPTALL = "u_0_k";
    public static final String REGISTER = "u_0_2";
    public static final String REGISTER_WINDOW_NAME = "u_2_d";
    public static final String DAY = "day";
    public static final String MONTH = "month";
    public static final String YEAR = "year";


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://pl-pl.facebook.com/");

        Thread.sleep(2000);

        while (!driver.findElement(By.id(ACCEPTALL)).isDisplayed());

        Thread.sleep(2000);

        WebElement acceptAll = driver.findElement(By.id(ACCEPTALL));
        acceptAll.click();

        Thread.sleep(2000);

        WebElement registerField = driver.findElement(By.id(REGISTER));
        registerField.click();

        Thread.sleep(2000);

        //while (!driver.findElement(By.id(REGISTER_WINDOW_NAME)).isDisplayed());

        WebElement selectDay = driver.findElement(By.id(DAY));
        Select selectDayNumber = new Select(selectDay);
        selectDayNumber.selectByIndex(26);

        //Thread.sleep(5000);

        WebElement selectMonth = driver.findElement(By.id(MONTH));
        Select selectMonthNumber = new Select(selectMonth);
        selectMonthNumber.selectByIndex(11);

        //Thread.sleep(5000);

        WebElement selectYear = driver.findElement(By.id(YEAR));
        Select selectYearNumber = new Select(selectYear);
        selectYearNumber.selectByValue("1991");
    }
}
