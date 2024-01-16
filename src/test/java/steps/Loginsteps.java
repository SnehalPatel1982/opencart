package steps;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;
import org.junit.Assert;
import pages.LoginPage;

import static driverFactory.DriverFactory.driver;
import static driverFactory.DriverFactory.getDriver;

public class Loginsteps {

    LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    @When("go to open cart demo website")
    public void go_to_open_cart_demo_website() {
        DriverFactory.getDriver().get("http://localhost/opencart/upload/");
        String Actual = loginPage.setURL();
        Assert.assertThat(Actual, Matchers.endsWith("https://demo.opencart.com/"));
    }

    @Given("click on MyAccount button from menubar")
    public void click_on_my_account_button_from_menubar() throws InterruptedException {
        Thread.sleep(5000);
        loginPage.setAccoutbutton();

    }

    @Then("Select Login Button")
    public void select_login_button() throws InterruptedException {

        Thread.sleep(5000);
        loginPage.setLoginbutton();
    }

    @When("Click on New Customer")
    public void click_on_new_customer() throws InterruptedException {
        Thread.sleep(5000);
        loginPage.setContinue();
    }

    @Then("Enter all Customer Personnel Details")
    public void enter_all_customer_personnel_details() throws InterruptedException {
        Thread.sleep(5000);
        loginPage.setFirstname();
        loginPage.setLastname();
        loginPage.setEmail();
        loginPage.setPassword();
        Thread.sleep(5000);
        loginPage.setCheckbox();
        loginPage.setSubmitButton();
    }

}
