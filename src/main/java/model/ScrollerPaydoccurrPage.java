package model;

import entity.DriverEntity;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ScrollerPaydoccurrPage extends DriverEntity {

    private final By title = By.xpath("//div[text()='Поручения на перевод валюты']");
    private final By titleTableSetup = By.xpath("//div[text()='Вид таблицы']");

    public ScrollerPaydoccurrPage(WebDriver driver) {
        super(driver);
    }
    @Step("wait for title")
    public boolean titlePaydoccurrVisible() {
        return driver.findElement(titleTableSetup).isDisplayed();
    }
}
