package com.nopcommerce.demo.Pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {
    By firstNameTextBox = By.id("BillingNewAddress_FirstName");
    By lastNameTextBox = By.id("BillingNewAddress_LastName");
    By emailTextBox = By.id("BillingNewAddress_Email");
    By countryDropdown = By.id("BillingNewAddress_CountryId");
    By cityTextBox = By.id("BillingNewAddress_City");
    By address1TextBox = By.id("BillingNewAddress_Address1");
    By postalcodeTextBox = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumberTextBox = By.id("BillingNewAddress_PhoneNumber");
    By continueButton = By.xpath("//button[@onclick='Billing.save()']");
    By nextDayAirRadioButton = By.id("shippingoption_1");
    By creditCard = By.id("paymentmethod_1");
    By paymentContinue = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By continueButton1 = By.xpath("//button[@onclick='ShippingMethod.save()']");
    By creditCardDropDown = By.id("CreditCardType");
    By cardHolderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By expireMonthDropdown = By.id("ExpireMonth");
    By expireYearDropdown = By.id("ExpireYear");
    By cardCode = By.id("CardCode");
    By continueButton2 =  By.xpath("(//button[@class='button-1 payment-info-next-step-button'])[1]");
    By creditCardText = By.xpath("//span[contains(text(),'Credit Card')]");
    By nextDayAirText = By.xpath("//span[contains(text(),'Next Day Air')]");
    By totalAmountText = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
    By confirmButton = By.xpath("//button[contains(text(),'Confirm')]");
    By thankYouText = By.xpath("//h1[contains(text(),'Thank you')]");
    By orderSuccessProcessText = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continueButton3 = By.xpath("//button[contains(text(),'Continue')]");
    By radioButton2ndDayAir = By.id("shippingoption_2");
    By secondDayAirText = By.xpath("//span[contains(.,'2nd Day Air')]");
    By totalAmountNokiaText = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");

    public void inputFirstname(String firstname){
        sendTextToElement(firstNameTextBox, firstname);
    }
    public void inputLastname(String lastname){
        sendTextToElement(lastNameTextBox, lastname);
    }
    public void inputEmail(String email){
        sendTextToElement(emailTextBox, email);
    }
    public void selectCountry(String countryname){
        selectByVisibleTextFromDropDown(countryDropdown,countryname);
    }
    public void inputCity(String cityname){
        sendTextToElement(cityTextBox,cityname);
    }
    public void inputAddress1(String address){
        sendTextToElement(address1TextBox,address);
    }
    public void inputPostalCode(String postcode){
        sendTextToElement(postalcodeTextBox,postcode);
    }
    public void inputPhoneNumber(String phone){
        sendTextToElement(phoneNumberTextBox,phone);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    public void clickOnNextDayAirRadioButton(){
        clickOnElement(nextDayAirRadioButton);
    }
    public void clickOnContinueButton1(){
        clickOnElement(continueButton1);
    }
    public void clickOnCreditCard(){
        clickOnElement(creditCard);
    }
    public void clickOnPaymentContinueButton(){
        clickOnElement(paymentContinue);
    }
    public void selectCreditCard(String card){
        selectByVisibleTextFromDropDown(creditCardDropDown,card);
    }

    public void inputCardHolderName(String holdername)
    {
        sendTextToElement(cardHolderName,holdername);
    }
    public void inputCardNumber(String card){
        sendTextToElement(cardNumber, card);

    }
    public void selectExpireMonth(String expirymonth){
        selectByVisibleTextFromDropDown(expireMonthDropdown,expirymonth);
    }
    public void selectExpireYear(String expiryyear){
        selectByVisibleTextFromDropDown(expireYearDropdown,expiryyear);
    }
    public void inputCardCode(String cvc){
        sendTextToElement(cardCode,cvc);
    }
    public void clickOnContinueButton2()
    {
        clickOnElement(continueButton2);
    }
    public void verifyCreditCardText(){

       assertVerifyText(creditCardText,"Credit Card");
    }
    public void verifyNextDayAirText(){

       assertVerifyText(nextDayAirText,"Next Day Air");
    }
    public void verifyTotalAmountText(){

        assertVerifyText(totalAmountText,"$2,950.00");
    }
    public void clickOnConfirmButton(){
        clickOnElement(confirmButton);
    }
    public void verifyThankYouText(){

        assertVerifyText(thankYouText,"Thank you");
    }
    public void verifyOrderSuccessProcessText(){

        assertVerifyText(orderSuccessProcessText,"Your order has been successfully processed!");
    }
    public void clickOnContinueButton3(){
        clickOnElement(continueButton3);
    }
    public void clickOnRadioButton2ndDayAir(){
        clickOnElement(radioButton2ndDayAir);
    }
    public void verify02ndDayText(){

        assertVerifyText(secondDayAirText,"2nd Day Air");
    }
    public void verifyTotalAmountNokiaText(){

        assertVerifyText(totalAmountNokiaText,"$698.00");
    }
}
