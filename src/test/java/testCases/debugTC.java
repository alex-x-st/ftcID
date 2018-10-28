package testCases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.accountPage;
import pages.signInPage;
import pages.welcomePage;
import config.accounts;

import java.util.concurrent.TimeUnit;

public class debugTC {

    @Test
    // SignIn and SignOut
    public void verifyLinkSignIn() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://secure.eplanservices401k.com");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        welcomePage welcomePage = new welcomePage(driver);
        //welcomePage.clickLinkSiteLogin1();
        welcomePage.clickLinkSiteLogin2();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        accounts accounts = new accounts();
        signInPage signInPage = new signInPage(driver);
        signInPage.typeUserName(accounts.getTestAccountName1());
        signInPage.typePassword(accounts.getTestAccountPassword1());
        signInPage.clickButtonSignIn();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        accountPage accountPage = new accountPage(driver);
        accountPage.clickLinkAccountProfileMenu();
        String pageAccountName = accountPage.getPageAccountName();
        //String givenAccountName = "JJJack Holloway";
        String givenAccountName = accounts.getTestFullAccountName1();

        Assert.assertTrue("Account Names should be equal!",
                givenAccountName.equals(pageAccountName));

        accountPage.clickLinkSignOut();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.close();
    }
}
