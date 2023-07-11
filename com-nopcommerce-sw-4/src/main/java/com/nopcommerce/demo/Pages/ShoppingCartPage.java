package com.nopcommerce.demo.Pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ShoppingCartPage extends Utility {
    By shoppingCartText = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By quantity = By.xpath("//td[@class='quantity']/child::input");
    By qutslear = By.xpath("//td[@class='quantity']/child::input");
    By updateShoppingCart = By.id("updatecart");
    By total = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
    By termsOfServiceCheckBox = By.id("termsofservice");
    By checkOutButton = By.id("checkout");
    By verifyQuantity = By.xpath("//span[contains(text(),'(2)')]");
    By verifyTotal = By.xpath("//td[@class='subtotal']/span[text()='$2,950.00']");


    public void verifyShoppingCartText(){

        assertVerifyText(shoppingCartText,"Shopping cart");
    }
    public void changeQuantity(){
        driver.findElement( qutslear).clear();

        sendTextToElement(quantity, Keys.BACK_SPACE + "2");
    }
    public void clickOnUpdateCartButton(){
        clickOnElement(updateShoppingCart);
    }
    public void verifyTotalText(){

        assertVerifyText(total,"$698.00");
    }
    public void clickOnTermsOfServiceCheckBox(){
        clickOnElement(termsOfServiceCheckBox);
    }
    public void clickOnCheckOutButton(){
        clickOnElement(checkOutButton);
    }
    public void VerifyQuantity(){

        assertVerifyText(verifyQuantity,"(2)");
    }
    public void VerifyTotal(){

        assertVerifyText(verifyTotal,"$2,950.00");
    }
}
