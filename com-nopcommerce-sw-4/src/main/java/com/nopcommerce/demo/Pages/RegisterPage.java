package com.nopcommerce.demo.Pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By registerText = By.xpath("//h1[contains(text(),'Register')]");
    By firstNameTextBox = By.id("FirstName");
    By lastNameTextBox = By.id("LastName");
    By emailTextBox = By.id("Email");
    By passwordTextBox = By.id("Password");
    By confirmPasswordTextBox = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By registerSuccessText = By.xpath("//div[contains(text(),'Your registration completed')]");
    By continueButton = By.xpath("//a[contains(text(),'Continue')]");

    public void verifyRegisterText() {

        assertVerifyText(registerText,"Register");
    }

    public void inputFirstname(String firstname) {
        sendTextToElement(firstNameTextBox, firstname);
    }

    public void inputLastname(String lastname) {
        sendTextToElement(lastNameTextBox, lastname);
    }

    public void inputEmail(String email) {
        sendTextToElement(emailTextBox, email);
    }

    public void inputPassword(String password) {
        sendTextToElement(passwordTextBox, password);
    }

    public void inputConfirmPassword(String confirmpassword) {
        sendTextToElement(confirmPasswordTextBox, confirmpassword);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public void verifyRegisterSuccessText() {

        assertVerifyText(registerSuccessText,"Your registration completed");
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

}
