import io.github.bonigarcia.wdm.WebDriverManager;
import model.LoginPage;
import model.MainPage;
import model.ScrollerPaydoccurrPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static entity.Entity.*;
import static org.junit.Assert.assertTrue;

public class Base {

    protected LoginPage loginPage;
    protected MainPage mainPage;
    protected ScrollerPaydoccurrPage scrollerPaydoccurrPage;
    protected WebDriver driver;

    @Before
    public void setDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", CHROMEDRIVERPATH);

        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
        scrollerPaydoccurrPage = new ScrollerPaydoccurrPage(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(URL);
        loginPage.login(LOGIN, PASSWORD);
        assertTrue("Wait for title main is displayed", mainPage.titleMainVisible());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
