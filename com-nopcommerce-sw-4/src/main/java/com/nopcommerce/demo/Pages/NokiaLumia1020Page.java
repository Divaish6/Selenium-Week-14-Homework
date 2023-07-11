package com.nopcommerce.demo.Pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class NokiaLumia1020Page extends Utility {
    By nokiaLumiaText = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By nokiaPriceText = By.id("price-value-20");
    By cartQuantity = By.id("product_enteredQuantity_20");
    By cleaqQuantity = By.id("product_enteredQuantity_20");
    By addToCartButton = By.id("add-to-cart-button-20");
    By productAddedToCartText = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By closeTheBarMsg = By.xpath("//span[@title='Close']");
    By shoppingCartElement = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCartElement = By.xpath("//button[contains(text(),'Go to cart')]");

    public void verifyNokiaLumiaText() {

        assertVerifyText(nokiaLumiaText,"Nokia Lumia 1020");
    }

    public void verifyNokiaPriceText() {

        assertVerifyText(nokiaPriceText,"$349.00");
    }

    public void changeQuantity(String text) {
        driver.findElement(cleaqQuantity).clear();
        sendTextToElement(cartQuantity,text);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public void  verifyTextFromProductAddedToCart() {

        assertVerifyText(productAddedToCartText,"The product has been added to your shopping cart");
    }

    public void closeTheBarByClickingOnTheCrossButton() {
        clickOnElement(closeTheBarMsg);
    }

    public void mouseHoverOnShoppingCart() {
        mouseHoverToElement(shoppingCartElement);
    }

    public void clickOnShoppingCart() {
        clickOnElement(goToCartElement);
    }
}
