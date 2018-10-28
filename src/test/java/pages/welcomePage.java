package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class welcomePage {

    WebDriver driver;

    public welcomePage(WebDriver driver) {
        this.driver=driver;
    }

    By linkSiteLogin1 = By.xpath("//*[@href='/home/login.jsp' and @class='sideNavOff']");
    By linkSiteLogin2 = By.id("sitelogin");

    public void clickLinkSiteLogin1() {
        driver.findElement(linkSiteLogin1).click();
    }

    public void clickLinkSiteLogin2() {
        driver.findElement(linkSiteLogin2).click();
    }

}
