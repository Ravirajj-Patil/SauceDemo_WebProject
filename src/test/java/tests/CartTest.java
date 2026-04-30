package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CartTest extends BaseTest {

    @Test
    public void addToCartTest() throws InterruptedException {
        LoginPage login = new LoginPage(driver);
        InventoryPage inventory = new InventoryPage(driver);
        CartPage cart = new CartPage(driver);

        login.login("standard_user", "secret_sauce");
        inventory.addItem();
        inventory.openCart();
        Thread.sleep(10000);      
        Assert.assertTrue(cart.verifyItemPresent());
    }
}