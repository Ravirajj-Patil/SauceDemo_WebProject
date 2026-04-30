

package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.InventoryPage;
import pages.LoginPage;

public class LogoutTest extends BaseTest {

    @Test
    public void logoutFlowTest() {

        LoginPage login = new LoginPage(driver);
        InventoryPage inventory = new InventoryPage(driver);

        // Step 1: Login
        login.login("standard_user", "secret_sauce");

        // Step 2: Logout
        inventory.clickMenu();
        inventory.clickLogout();

        // Step 3: Verify redirected to login page
        Assert.assertTrue(driver.getCurrentUrl().contains("saucedemo.com"));

        // Step 4: Verify protected page not accessible
        driver.get("https://www.saucedemo.com/inventory.html");

        // Should redirect back to login
        Assert.assertTrue(driver.getCurrentUrl().contains("saucedemo.com"));
    }
}
