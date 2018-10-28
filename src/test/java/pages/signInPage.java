package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signInPage {

    WebDriver driver;

    public signInPage(WebDriver driver) {
        this.driver=driver;
    }

    By inputBoxUserName = By.xpath("//input[@name='username']");
    By inputBoxPassword = By.xpath("//input[@name='password']");
    By buttonSignIn = By.id("loginButton");
    By linkTrouble = By.xpath("//*[@class='link trouble-link-branding is']");

    public void typeUserName(String account) {
        driver.findElement(inputBoxUserName).sendKeys(account);
    }

    public void typePassword(String password) {
        driver.findElement(inputBoxPassword).sendKeys(password);
    }

    public void clickButtonSignIn() {
        driver.findElement(buttonSignIn).click();
    }

    public void clickLinkTrouble() {
        driver.findElement(linkTrouble).click();
    }
}
