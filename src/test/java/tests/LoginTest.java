package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.InventoryPage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test(priority = 1)
    public void validLogin() throws InterruptedException {
        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauce");
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
        Thread.sleep(6000);
    }

    @Test(priority = 2)
    public void invalidLogin() throws InterruptedException {
        LoginPage login = new LoginPage(driver);
        login.login("wrong", "wrong");
        Assert.assertTrue(login.getError().length() > 0);
        Thread.sleep(6000);
    }
    
    @Test(priority = 3)
    public void emptyCredentialsTest() throws InterruptedException {
        LoginPage login = new LoginPage(driver);

        login.login("", "");

        Assert.assertTrue(login.getError().contains("Username is required"));
        Thread.sleep(6000);
    }
    
    @Test(priority = 4)
    public void specialCharacterLoginTest() throws InterruptedException {
        LoginPage login = new LoginPage(driver);

        login.login("@@@@", "####");

        Assert.assertTrue(login.getError().length() > 0);
        Thread.sleep(6000);
    }
    
    
    @Test(priority = 5)
    public void dashboardValidationTest() throws InterruptedException {

        LoginPage login = new LoginPage(driver);
        InventoryPage inventory = new InventoryPage(driver);

        login.login("standard_user", "secret_sauce");

        Assert.assertEquals(inventory.getPageTitleText(), "Products");
        Assert.assertTrue(inventory.isMenuDisplayed());
        Assert.assertTrue(inventory.isCartDisplayed());
        Thread.sleep(6000);
    }
    
    
}