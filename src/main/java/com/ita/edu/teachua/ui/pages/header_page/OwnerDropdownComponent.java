package com.ita.edu.teachua.ui.pages.header_page;

import com.ita.edu.teachua.ui.elements.custom_elements.Button;

import com.ita.edu.teachua.ui.locators.pages_locators.header_locators.OwnerDropdownComponentLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import com.ita.edu.teachua.ui.pages.profile_page.AddCenterPopUpComponent;
import com.ita.edu.teachua.ui.pages.profile_page.ProfilePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OwnerDropdownComponent extends BasePage {

    @FindBy(how = How.XPATH, using = OwnerDropdownComponentLocators.ADD_CENTER_BUTTON_XPATH)
    private Button addCenterButton;
    @FindBy(how = How.XPATH, using = OwnerDropdownComponentLocators.MY_PROFILE_BUTTON_XPATH)
    private Button myProfileButton;

    public OwnerDropdownComponent(WebDriver driver) {
        super(driver);
    }

    public AddCenterPopUpComponent clickOnAddCenterButton() {
        addCenterButton.click();
        return new AddCenterPopUpComponent(driver);
    }

    public ProfilePage clickOnProfile() {
        myProfileButton.click();
        return new ProfilePage(driver);
    }

}