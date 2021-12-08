package com.ita.edu.teachua.ui.tests;


import com.ita.edu.teachua.ui.pages.header_page.HeaderPage;
import com.ita.edu.teachua.ui.pages.header_page.RestoringBeginPopUpComponent;
import com.ita.edu.teachua.ui.pages.header_page.RestoringPasswordFinishPopUpComponent;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ResorePasswordViaGmailApi extends TestRunner {

    @Test
    public void VerifyNewPasswordValidationWhenRestoringPasswordViaForgotPassword(){
        HeaderPage header = new HeaderPage(driver);
        header.clickOnGuestDropdown()
                .clickOnLoginButton()
                .clickOnForgotPasswordButton()
                .inputEmail("speak.ukrainian.atqc.test@gmail.com")
                .clickOnRestore()
                .setNewRandomPassword();



        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    @Description("TUA-322 Verify if error message is displayed if passwords in 'Введіть новий пароль', 'Введіть новий пароль повторно' are not equal")
    @Issue("TUA-322")
    @Test
    public void verifyErrorPasswordAndReenterPasswordNotEqualTest() {
        HeaderPage header = new HeaderPage(driver);
        RestoringPasswordFinishPopUpComponent restoringPassword = new RestoringPasswordFinishPopUpComponent(driver);
        header.clickOnGuestDropdown()
                .clickOnLoginButton()
                .clickOnForgotPasswordButton()
                .inputEmail("speak.ukrainian.atqc.test@gmail.com")
                .clickOnRestore()
                .fillInNewPasswordField("Porosh0k!2");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(restoringPassword.isPresentGreenMark());
        restoringPassword.fillReenterNewPasswordField("Rampam12@");
        softAssert.assertEquals(restoringPassword.getErrorMessagePasswordNotEqual(), "Значення поля ‘Підтвердити новий пароль’ має бути еквівалентним значенню поля ‘Новий пароль’");
        softAssert.assertAll();
    }


    @Description("TUA-319 Verify if  user can change the password entering incorrect email")
    @Issue("TUA-319")
    @Test
    public void restorePasswordWithInvalidEmailTest() {
        HeaderPage header = new HeaderPage(driver);
        RestoringBeginPopUpComponent restoringPopUp =new RestoringBeginPopUpComponent(driver);
        header.clickOnGuestDropdown()
                .clickOnLoginButton()
                .clickOnForgotPasswordButton()
                .inputEmail("kjfdhgiuerehgo")
                .clickOnRestoreButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(restoringPopUp.isRedMarkVisible());
        softAssert.assertEquals(restoringPopUp.getInputBorderColor(), "rgb(255, 77, 79)");
        restoringPopUp.inputEmail("")
                .clickOnRestoreButton();
        softAssert.assertTrue(restoringPopUp.isRedMarkVisible());
        softAssert.assertEquals(restoringPopUp.getInputBorderColor(), "rgb(255, 77, 79)");
        restoringPopUp.inputEmail("val@valera.valeriyovychk")
                .clickOnRestoreButton();
        softAssert.assertEquals(restoringPopUp.getInvalidEmailError(), "Користувача з вказаним емейлом не знайдено");
        softAssert.assertAll();
    }

}