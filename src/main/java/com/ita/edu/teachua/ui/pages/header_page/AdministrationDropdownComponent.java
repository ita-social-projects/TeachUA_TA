package com.ita.edu.teachua.ui.pages.header_page;

import com.ita.edu.teachua.ui.elements.custom_elements.Button;
import com.ita.edu.teachua.ui.locators.header_locators.AdministrationDropdownFromOwnerComponentLocators;
import com.ita.edu.teachua.ui.pages.administration_pages.BannerPage;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import com.ita.edu.teachua.ui.pages.challenge_page.AddChallengePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdministrationDropdownComponent extends BasePage {
    @FindBy(how = How.XPATH, using = AdministrationDropdownFromOwnerComponentLocators.BANNER_BUTTON)
    private Button bannerButton;
    @FindBy(how = How.XPATH, using = AdministrationDropdownFromOwnerComponentLocators.CHALLENGES_BUTTON)
    private Button challengeButton;

    public AdministrationDropdownComponent(WebDriver driver) {
        super(driver);
        //this.bannerButton = bannerButton;
    }
    @Step("Click on 'Banner' button")
    public BannerPage clickOnBannerButton() {
        bannerButton.click();
        return new BannerPage(driver);
    }

    @Step("Click on 'Challenges' button")
    public AddChallengePage clickOnChallengesButton() {
        challengeButton.click();
        return new AddChallengePage(driver);
    }

    public AdministrationDropdownComponent getAdministrationDropdownComponent(){
        return this;
    }
}
