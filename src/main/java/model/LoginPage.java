package model;

import entity.DriverEntity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends DriverEntity {

    private final By inputLogin = By.xpath("//input[@name='login']");
    private final By inputPassword = By.xpath("//input[@name='password']");
    private final By buttonLogin = By.xpath("//button[@class='css-d34lyg']");
    private final By title = By.xpath("//div[@class='css-l6zity']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String login, String password) {
        driver.findElement(inputLogin).sendKeys(login);
        driver.findElement(inputPassword).sendKeys(password);
        driver.findElement(buttonLogin).click();
        for (int i = 0; i <= 5; i++) {
            driver.findElement(By.xpath("//input[@data-name='digit-" + i + "']")).sendKeys("1");
        }
    }
}
