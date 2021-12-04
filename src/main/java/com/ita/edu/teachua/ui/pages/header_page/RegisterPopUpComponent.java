package com.ita.edu.teachua.ui.pages.header_page;

/*import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.InputElement;*/
import com.ita.edu.teachua.ui.elements.custom_elements.Button;
import com.ita.edu.teachua.ui.elements.custom_elements.Input;
import com.ita.edu.teachua.ui.locators.pages_locators.header_locators.RegisterPopUpComponentLocators;
//import com.ita.edu.teachua.ui.locators.pageslocators.headerlocators.RegisterPopUpComponentLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPopUpComponent extends BasePage {
    @FindBy(how = How.ID, using = RegisterPopUpComponentLocators.FIRST_NAME_FIELD_ID)
    private Input firstName;
    @FindBy(how = How.ID, using = RegisterPopUpComponentLocators.LAST_NAME_FIELD_ID)
    private Input lastName;
    @FindBy(how = How.ID, using = RegisterPopUpComponentLocators.PHONE_NUMBER_FIELD_ID)
    private Input phoneNumber;
    @FindBy(how = How.ID, using = RegisterPopUpComponentLocators.EMAIL_FIELD_ID)
    private Input email;
    @FindBy(how = How.ID, using = RegisterPopUpComponentLocators.PASSWORD_FIELD_ID)
    private Input password;
    @FindBy(how = How.ID, using = RegisterPopUpComponentLocators.PASSWORD_CONFIRM_FIELD_ID)
    private Input passwordConfirm;
    @FindBy(how = How.ID, using = RegisterPopUpComponentLocators.REGISTER_BUTTON_XPATH)
    private Button registerButton;
    @FindBy(how = How.ID, using = RegisterPopUpComponentLocators.CLOSE_BUTTON_XPATH)
    private Button closeButton;

    public RegisterPopUpComponent(WebDriver driver) {
        super(driver);
    }


    public void clickRegisterButton() {
        registerButton.click();
    }

    public RegisterPopUpComponent clickFirstNameField() {
        firstName.click();
        return this;
    }

    public RegisterPopUpComponent fillFirstName(String firstNameFill) {
        firstName.sendKeys(firstNameFill);
        return this;
    }

    public RegisterPopUpComponent clickLastNameField() {
        lastName.click();
        return this;
    }

    public Input getLastNameField() {
        return lastName;
    }

    public Input getFirstNameField() {
        return firstName;
    }

    public Input getEmailField() {
        return email;
    }

    public Input getPasswordField() {
        return password;
    }

    public Input getPhoneNumber() {
        return phoneNumber;
    }

    public Input getPasswordConfirmField() {
        sleep(400);
        return passwordConfirm;
    }

    public RegisterPopUpComponent fillLastName(String lastNameFill) {
        lastName.sendKeys(lastNameFill);
        return this;
    }

    public RegisterPopUpComponent clickEmailField() {
        email.click();
        return this;
    }

    public RegisterPopUpComponent fillEmail(String emailFill) {
        email.sendKeys(emailFill);
        return this;
    }

    public RegisterPopUpComponent clickPhoneNumberField() {
        phoneNumber.click();
        return this;
    }

    public RegisterPopUpComponent fillPhoneNumber(String phoneNumberFill) {
        phoneNumber.sendKeys(phoneNumberFill);
        return this;
    }

    public RegisterPopUpComponent clickPasswordField() {
        password.click();
        return this;
    }

    public RegisterPopUpComponent fillPassword(String passwordFill) {
        password.sendKeys(passwordFill);
        return this;
    }

    public RegisterPopUpComponent clickPasswordConfirmField() {
        passwordConfirm.click();
        return this;
    }

    public RegisterPopUpComponent fillPasswordConfirm(String passwordConfirmFill) {
        passwordConfirm.sendKeys(passwordConfirmFill);
        return this;
    }

    public RegisterPopUpComponent clearFirstNameField() {
        firstName.clear();
        return this;
    }

    public RegisterPopUpComponent clearEmailField() {
        email.clear();
        return this;
    }

    public RegisterPopUpComponent clearPasswordField() {
        password.clear();
        return this;
    }

    public RegisterPopUpComponent clearPasswordConfirmField() {
        passwordConfirm.clear();
        return this;
    }

    public HeaderPage clickCloseButton() {
        closeButton.click();
        return new HeaderPage(driver);
    }

    public RegisterPopUpComponent clearLastNameField() {
        lastName.clear();
        return this;
    }

    public String getLastNameText() {
        return lastName.getText();
    }

    public String getFirstNameText() {
        return firstName.getText();
    }

    public String getEmailText() {
        return email.getText();
    }

    public String getPasswordText() {
        return password.getText();
    }

    public String getPhoneNumberText() {
        return phoneNumber.getText();
    }
}
