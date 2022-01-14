package com.ita.edu.teachua.cucumber.steps_definitions;

import com.ita.edu.teachua.ui.pages.AllPages;
import com.ita.edu.teachua.ui.pages.profile_page.AllProfileComponents;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;


import java.lang.reflect.InvocationTargetException;

public class CanAddLocation {
    private final BaseDefinition baseDef;
    private final AllPages allPages;
    private final AllProfileComponents allProfileComponents;
    private final SoftAssert softAssert;

    public CanAddLocation(BaseDefinition baseDef)  {
        this.baseDef = baseDef;
        allPages = new AllPages(baseDef.getDriver());
        softAssert = new SoftAssert();
        allProfileComponents= new AllProfileComponents(baseDef.getDriver());
    }

    @Given("Log in as an Керівник email = {adminEmail}, password = {adminPassword}")
    public void logInAsAnКерівникEmailEmailPasswordPassword(String email, String password) {
        allPages.getHeaderPage().authorize(email, password);
    }

    @Then("Go to the Мій профіль")
    public void goToTheМійПрофіль() {
        allPages.getHeaderPage()
                .clickOnOwnerDropdown()
                .clickOnProfile();

    }

    @Then("Click the Додати гурток button")
    public void clickTheДодатиГуртокButton() {
        allPages.getProfilePage()
                .clickOnAddButton()
                .clickOnAddClubButton();
    }

    @And("Enter valid data into the Назва field of Основна інформація tab {validClubName}")
    public void enterValidDataIntoTheНазваFieldOfОсновнаІнформаціяTab(String validClubName) {
        allProfileComponents.getAddClubPopUpComponent()
                .fillClubNameField(validClubName);

    }

    @And("Check off at least one check-box from Категорія group box")
    public void checkOffAtLeastOneCheckBoxFromКатегоріяGroupBox() {
        allProfileComponents.getAddClubPopUpComponent().chooseSportSections();
    }

    @And("Enter valid data into the Вік дитини field ageFrom = {ageFrom} ageTo = {ageTo}")
    public void enterValidDataIntoTheВікДитиниFieldAgeFromAgeFromAgeToAgeTo(String ageFrom, String ageTo) {
        allProfileComponents.getAddClubPopUpComponent().fillChildAge(ageFrom, ageTo);
    }

    @Then("Click the Наступний крок button")
    public void clickTheНаступнийКрокButton() {
        allProfileComponents.getAddClubPopUpComponent().clickOnNextStepButton();
    }

    @Then("Click the Додати локацію link on the Контакти tab")
    public void clickTheДодатиЛокаціюLinkOnTheКонтактиTab() {
        allProfileComponents.getAddClubPopUpComponent().clickOnAddLocation();

    }

    @And("Check if Додати локацію pop up is displayed")
    public void checkIfДодатиЛокаціюPopUpIsDisplayed() {
        softAssert.assertTrue(allProfileComponents.getAddLocationPopUpComponent().addLocationPopUpBlockIsDisplayed());
    }

    @Then("Enter valid data into the Назва field of Додати локацію pop-up {validLocationName}")
    public void enterValidDataIntoTheНазваFieldOfДодатиЛокаціюPopUpValidAddress(String validLocationName) {
        allProfileComponents.getAddLocationPopUpComponent().sendKeysLocationNameField(validLocationName);
    }

    @And("Check if Data in the Назва field is accepted by input with {addLocationPopUpIds} at 0 index")
    public void checkIfDataInTheНазваFieldIsAccepted(String[] addLocationPopUpIds) {
        allProfileComponents.getAddLocationPopUpComponent().isDataAccepted(addLocationPopUpIds[0]);
    }

    @Then("Choose a Kyiv city from the Місто drop-down list")
    public void chooseAKyivCityFromTheМістоDropDownList() {
        allProfileComponents.getAddLocationPopUpComponent()
                .clickOnCityDropdown()
                .clickOnKyivButton();
    }

    @And("Check if The Kyiv city accepted from the drop-down list by when choosing it in dropdown with {addLocationPopUpIds} at 1 index")
    public void checkIfTheKyivCityAcceptedFromTheDropDownListByWhenChoosingItInDropdownWithAddLocationPopUpIdsAtIndex(String[] addLocationPopUpIds) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        softAssert.assertTrue(allProfileComponents.getAddLocationPopUpComponent().isDataAccepted(addLocationPopUpIds[1]));
    }

    @Then("Choose Akademmistechko from the Метро\\/Місцевість drop-down list")
    public void chooseAkademmistechkoFromTheМетроМісцевістьDropdownList()  {
        allProfileComponents.getAddLocationPopUpComponent()
                .clickOnLocalityDropdown()
                .clickOnAkademmistechkoButton();
    }

    @And("Check if The Akademmistechko from the Метро\\/Місцевість accepted from drop-down list with {addLocationPopUpIds} at 2 index")
    public void checkIfTheAkademmistechkoFromTheМетроМісцевістьAcceptedFromDropDownListWithAddLocationPopUpIdsAtIndex(String[] addLocationPopUpIds) {
        softAssert.assertTrue(allProfileComponents.getAddLocationPopUpComponent().isDataAccepted(addLocationPopUpIds[2]));
    }

    @Then("Choose a Desnianskyi district from the Район міста drop-down list")
    public void chooseADesnianskyiDistrictFromTheРайонМістаDropDownList() {
        allProfileComponents.getAddLocationPopUpComponent()
                .clickOnDistrictDropdown()
                .clickOnDesnianskyiButton();
    }

    @And("Check if The Desnianskyi district from the Район accepted from drop-down list with {addLocationPopUpIds} at 3 index")
    public void checkIfTheDesnianskyiDistrictFromTheРайонAcceptedFromDropDownListWithAddLocationPopUpIdsAtIndex(String[] addLocationPopUpIds) {
        softAssert.assertTrue(allProfileComponents.getAddLocationPopUpComponent().isDataAccepted(addLocationPopUpIds[3]));

    }

    @Then("Enter valid {validAddress} into the Адреса field")
    public void enterValidValidAddressIntoTheАдресаField(String validAddress) {
        allProfileComponents.getAddLocationPopUpComponent().sendKeysAddressField(validAddress);
    }

    @And("Check if Data in the Адреса field is accepted by input with {addLocationPopUpIds} at 4 index")
    public void checkIfDataInTheАдресаFieldIsAcceptedByInputWithAddLocationPopUpIdsAtIndex(String[] addLocationPopUpIds) {
        allProfileComponents.getAddLocationPopUpComponent().isDataAccepted(addLocationPopUpIds[4]);
    }
}
