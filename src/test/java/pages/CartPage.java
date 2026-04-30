package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    By item = By.className("inventory_item_name");

    public boolean verifyItemPresent() {
        return driver.findElements(item).size() > 0;
    }
}