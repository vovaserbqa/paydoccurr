package model;

import entity.DriverEntity;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ScrollerPaydoccurrPage extends DriverEntity {

    private final By title = By.xpath("//div[text()='Поручения на перевод валюты']");

    public ScrollerPaydoccurrPage(WebDriver driver) {
        super(driver);
    }
    @Step("wait for title")
    public boolean titleOnbVisible() {
        return driver.findElement(title).isDisplayed();
    }
}
