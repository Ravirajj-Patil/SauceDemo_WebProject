package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {

    WebDriver driver;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    By addToCart = By.id("add-to-cart-sauce-labs-bike-light");
    By cart = By.className("shopping_cart_link");
    
    By title = By.className("title");
    By menuBtn = By.id("react-burger-menu-btn");
    By cartIcon = By.className("shopping_cart_link");

    public void addItem() {
        driver.findElement(addToCart).click();
    }

    public void openCart() {
        driver.findElement(cart).click();
    }
    
    public String getPageTitleText() {
        return driver.findElement(title).getText();
    }

    public boolean isMenuDisplayed() {
        return driver.findElement(menuBtn).isDisplayed();
    }

    public boolean isCartDisplayed() {
        return driver.findElement(cartIcon).isDisplayed();
    }
    
}