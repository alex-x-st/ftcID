package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class accountPage {

    WebDriver driver;

    public accountPage(WebDriver driver) {
        this.driver=driver;
    }

    String accountName = "Jack Holloway";

    By labelAccountName = By.xpath("//span[text()='"+accountName+"']");
    By linkSignOut = By.xpath("//a[text()='Sign out']");
    By linkAccountProfileMenu = By.id("profileName");

    public String getPageAccountName() {
        return driver.findElement(labelAccountName).getText();
    }

    public String getGivenAccountName() {
        return this.accountName;
    }

    public void clickLinkSignOut() {
        driver.findElement(linkSignOut).click();
    }

    public void clickLinkAccountProfileMenu() {
        driver.findElement(linkAccountProfileMenu).click();
    }
}
