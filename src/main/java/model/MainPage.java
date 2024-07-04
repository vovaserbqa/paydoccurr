package model;

import entity.DriverEntity;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends DriverEntity {
    private final By header = By.xpath("//div[text()='Платежные документы']");
    private final By sectionApplications = By.xpath("//div[text()='Валютные операции']");
    private final By sectionUpApplications = By.xpath("//div[text()='Валютные документы']");
    private final By sectionPaydoccurr = By.xpath("//div[text()='Поручения на перевод валюты']");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @Step("wait for title")
    public boolean titleMainVisible() {
        return driver.findElement(header).isDisplayed();
    }

    @Step("wait for is displayed")
    public MainPage waitForElement(By element) {
        driver.findElement(element).isDisplayed();
        return this;
    }

    @Step
    public MainPage goToPaydoccurrSection() {
        waitForElement(sectionApplications);
        driver.findElement(sectionApplications).click();
        driver.findElement(sectionUpApplications).click();
        driver.findElement(sectionPaydoccurr).click();
        return this;
    }
}
