package com.ita.edu.teachua.cucumber.steps_definitions;

import com.ita.edu.teachua.utils.TestValueProvider;

import io.cucumber.java.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.IOException;
import java.time.Duration;

public class BaseDefinition {
    protected static WebDriver driver;
    protected static TestValueProvider testValueProvider;
    @BeforeAll
    public static void beforeAll() throws IOException {
        testValueProvider = new TestValueProvider();
        WebDriverManager.chromedriver().setup();


    }
    @Before
    public void before(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(testValueProvider.getBaseUrl());
    }

    @After
    public void after() throws IOException {
        if (driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver(){
        return driver;
    }

    @ParameterType("([^\"]*)")
    public String adminEmail(String email) {
        return email;
    }
    @ParameterType("([^\"]*)")
    public String adminPassword(String password) {
        return password;
    }
    @ParameterType("([^\"]*)")
    public String validClubName(String validClubName) {
        return validClubName;
    }
    @ParameterType("([^\"]*)")
    public String ageFrom(String ageFrom) {
        return ageFrom;
    }
    @ParameterType("([^\"]*)")
    public String ageTo(String ageTo) {
        return ageTo;
    }
    @ParameterType("([^\"]*)")
    public String validLocationName(String validLocationName) {
        return validLocationName;
    }
    @ParameterType("([^\"]*)")
    public String[] addLocationPopUpIds(String addLocationPopUpIds) {
        return addLocationPopUpIds.split(",");
    }
    @ParameterType("([^\"]*)")
    public String validAddress(String validAddress) {
        return validAddress;
    }

}