package com.ita.edu.teachua.ui.pages.header_page;

import com.ita.edu.teachua.ui.elements.custom_elements.Dropdown;
import com.ita.edu.teachua.ui.locators.pages_locators.header_locators.HeaderPageLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HeaderPage extends BasePage {

    @FindBy(how = How.XPATH, using = HeaderPageLocators.GUEST_DROPDOWN_XPATH)
    private Dropdown guestDropdown;
    @FindBy(how = How.CSS, using = HeaderPageLocators.OWNER_DROPDOWN_CSS_SELECTOR)
    private Dropdown ownerDropdown;

    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    public GuestDropdownComponent clickOnGuestDropdown() {
        guestDropdown.click();
        return new GuestDropdownComponent(driver);
    }
    public OwnerDropdownComponent clickOnOwnerDropdown() {
        guestDropdown.click();
        return new OwnerDropdownComponent(driver);
    }
    public HeaderPage authorize(String email, String password) {
        clickOnGuestDropdown().clickOnLoginButton().fillLoginFields(email, password);
        sleep(3000);
        return new HeaderPage(driver);
    }
}