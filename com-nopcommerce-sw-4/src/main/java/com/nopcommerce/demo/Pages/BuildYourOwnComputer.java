package com.nopcommerce.demo.Pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utility {
    By buildYourComputerText=By.xpath("//div[@class='product-name']/h1");
    By processor=(By.xpath("//select[@name='product_attribute_1']"));
    By ram=(By.cssSelector("#product_attribute_2"));
    By hddRadio=(By.xpath("//input[@id='product_attribute_3_7']"));
    By osRadio=(By.xpath("//label[text()='Vista Premium [+$60.00]']"));
    By msOfficeSoftware=By.xpath("//input[@id='product_attribute_5_10']");
    By totalCommander=By.xpath("//input[@id='product_attribute_5_12']");
    By priceText=By.xpath("//span[@class='price-value-1']");
    By addToCartButton = By.xpath("//button[@id='add-to-cart-button-1']");
    By verifyProductAddedToCart = By.xpath("//*[@id='bar-notification']/div/p");
    By closeTheBarMsg = By.xpath("//span[@class='close']");
    By mouseHoverOnShoppingCart1 = By.xpath("//span[contains(text(),'Shopping cart')]");
    By clickOnGoToCartButton1 = By.xpath("//button[contains(text(),'Go to cart')]");


    public void verifyTextFromBuildownComputer(){

        assertVerifyText(buildYourComputerText,"Build your own computer");
    }
    public void selectProcessor(String text){

        selectByVisibleTextFromDropDown(processor,text);
    }
    public void selectRAM(String text){

        selectByVisibleTextFromDropDown(ram,text);
    }
    public void selectHDDRadio(){
        clickOnElement(hddRadio);
    }
    public void selectOSRadio(){
        clickOnElement(osRadio);
    }
    public void selectSoftwareMS(){
        clickOnElement(msOfficeSoftware);
    }
    public void selectTotalCommander(){
        clickOnElement(totalCommander);
    }
    public void verifyTextFromPrice(){

        assertVerifyText(priceText,"$1,475.00");
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public void verifyTheProductHasBeenAddedToYourShoppingCart(){
        assertVerifyText(verifyProductAddedToCart,"The product has been added to your shopping cart");

    }

    public void closeTheBarByClickingOnTheCrossButton(){
        clickOnElement(closeTheBarMsg);
    }

    public void mouseHoverOnShoppingCartButton(){

        mouseHoverToElement(mouseHoverOnShoppingCart1);
    }
    public void clickOnGoToCartButton(){
        clickOnElement(clickOnGoToCartButton1);
    }
}
