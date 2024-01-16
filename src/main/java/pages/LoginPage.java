package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;

    By accoutbutton = By.xpath("//span[normalize-space()=\"My Account\"]");

    By Loginbutton = By.xpath("//a[normalize-space()='Login']");

    By Continue = By.xpath("//a[normalize-space()=\"Continue\"]");

    By Firstname = By.xpath("//input[@id=\"input-firstname\"]");

    By Lastname = By.xpath("//input[@id=\"input-lastname\"]");

    By Email = By.xpath("//input[@id=\"input-email\"]");

    By Password = By.xpath("//input[@id=\"input-password\"]");

    By Checkbox = By.xpath("//input[@name=\"agree\"]");

    By SubmitButton = By.xpath("//button[@class=\"btn btn-primary\"]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setAccoutbutton() {
        driver.findElement(accoutbutton).click();
    }

    public void setLoginbutton() {
        driver.findElement(Loginbutton).click();
    }

    public void setContinue() {
        driver.findElement(Continue).click();
    }

    public void setFirstname() {
        driver.findElement(Firstname).sendKeys("SSSS");
    }

    public void setLastname() {
        driver.findElement(Lastname).sendKeys("PPPP");
    }

    public void setEmail() {
        driver.findElement(Email).sendKeys("SSSPPP@gmail.com");
    }

    public void setPassword() {
        driver.findElement(Password).sendKeys("ZZZZ");
    }

    public void setCheckbox() {
        driver.findElement(Checkbox).click();
    }

    public void setSubmitButton() {
        driver.findElement(SubmitButton).click();
    }

    public String setURL() {
        String URL = driver.getCurrentUrl();
        return URL;
    }
}
