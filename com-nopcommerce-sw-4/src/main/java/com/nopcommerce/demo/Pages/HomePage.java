package com.nopcommerce.demo.Pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {
    By welcomeOurStoreText = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By logOutButton= By.xpath("//a[contains(text(),'Log out')]");

    public void selectMenu(String menu){
        List<WebElement> topMenuNames = driver.findElements(By.cssSelector("li>a"));
        for (WebElement names : topMenuNames) {
            //System.out.println(names.getText());
            if (names.getText().equalsIgnoreCase(menu)) {
                names.click();
                break;
            }
        }
    }
    public void verifyWelcomeOurStoreText(){

        assertVerifyText(welcomeOurStoreText,"Welcome to our store");
    }
    public void clickOnLogOutButton(){
        clickOnElement(logOutButton);
    }
}
