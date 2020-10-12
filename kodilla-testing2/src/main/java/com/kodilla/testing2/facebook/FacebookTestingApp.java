package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_SELECT_REGISTER = "//div[contains(@class, \"_6ltg\")]/a[contains(@role, \"button\")]";
    public static final String XPATH_WAIT_FOR = "//div[contains(@class, \"_8ien\")]";
    public static final String XPATH_SELECT_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[contains(@aria-label, \"Dzień\")]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[contains(@aria-label, \"Miesiąc\")]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[contains(@aria-label, \"Rok\")]";


    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com/");

        WebElement registerField = driver.findElement(By.xpath(XPATH_SELECT_REGISTER));
        registerField.submit();

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        WebElement selectDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDayNumber = new Select(selectDay);
        selectDayNumber.selectByIndex(26);

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonthNumber = new Select(selectMonth);
        selectMonthNumber.selectByIndex(26);

        WebElement selectYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYearNumber = new Select(selectYear);
        selectYearNumber.selectByIndex(26);
    }
}
