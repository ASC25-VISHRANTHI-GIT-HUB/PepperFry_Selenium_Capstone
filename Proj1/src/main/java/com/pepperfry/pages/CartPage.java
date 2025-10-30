package com.pepperfry.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CartPage {

    WebDriver driver;
    WebDriverWait wait;

    // Locators
    By addToCartButton = By.xpath("/html/body/app-root/main/app-vip/div/div[2]/div[2]/div[2]/section/div[6]/pf-vip-cta/div/div/div[1]/pf-button/button");
    By goToCartButton = By.xpath("/html/body/app-root/pf-header/header/div[2]/pf-header-main/div/div[1]/div/div[4]/pf-header-icons/div/div[4]/a/img");
    By proceedButton = By.xpath("/html/body/app-root/section/main/pf-cart/section/section/pf-cart-deskop-sticky-footer/div/div/div/div[2]/pf-button/button");

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(25));
    }

    // Step 1: Click "Add to Cart"
    public void clickAddToCart() {
        try {
            WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
            addToCart.click();
            
            System.out.println("Clicked 'Add to Cart' button successfully.");
        } catch (Exception e) {
            System.out.println("Error clicking 'Add to Cart' button: " + e.getMessage());
        }
    }

    // Step 2: Click "Go to Cart"
    public void clickGoToCart() {
        try {
            WebElement goToCart = wait.until(ExpectedConditions.elementToBeClickable(goToCartButton));
            goToCart.click();
            System.out.println("Clicked 'Go to Cart' and navigated to Cart page.");
        } catch (Exception e) {
            System.out.println("Error clicking 'Go to Cart': " + e.getMessage());
        }
    }
    // Step 3: Click Proceed 
    public boolean Proceed() {
        try {
            WebElement proceed = wait.until(ExpectedConditions.elementToBeClickable(proceedButton));
            proceed.click();
            System.out.println("Clicked 'Procced'");
            return true;
        } catch (Exception e) {
            System.out.println("Error clicking 'Procced': " + e.getMessage());
            return false;
        }
    }
}

