package com.ita.edu.teachua.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MainValueProvider {
    Properties properties = new Properties();

    public MainValueProvider() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/data.properties");
        properties.load(fileInputStream);
    }

    public String getBaseApiUrl() {
        return properties.getProperty("baseApiUrl");
    }

    public String getSignInClientUrl() {
        return properties.getProperty("signInClientUrl");
    }

    public String getClubClientUrl() {
        return properties.getProperty("clubClientUrl");
    }

    public String getCitiesUrl() {
        return properties.getProperty("citiesUrl");
    }

    public String getCityUrl() {
        return properties.getProperty("cityUrl");
    }

    public String getFeedbackUrl() {
        return properties.getProperty("feedbackUrl");
    }

    public String getFeedbacksUrl() {
        return properties.getProperty("feedbacksUrl");
    }

    public String getResetPasswordUrl() {
        return properties.getProperty("resetPasswordUrl");
    }

    public String getChallengeUrl() {
        return properties.getProperty("challengeUrl");
    }

    public String getDistrictClientUrl() {
        return properties.getProperty("districtClientUrl");
    }

    public String getCategoryClientUrl() {
        return properties.getProperty("categoryClientUrl");
    }

    public String getCategoriesClientUrl() {
        return properties.getProperty("categoriesClientUrl");
    }

    public String getCategoriesSearchClientUrl() {
        return properties.getProperty("categoriesSearchClientUrl");
    }

    public String getCenterClientUrl() {
        return properties.getProperty("centerClientUrl");
    }

    public String getCentersClientUrl() {
        return properties.getProperty("centersClientUrl");
    }

    public String getDistrictsListUrl() {
        return properties.getProperty("districtsListUrl");
    }

    public String getAboutUsUrl() {
        return properties.getProperty("aboutUsUrl");
    }

    public String getContactUrl() {
        return properties.getProperty("contactUrl");
    }

    public String getStationUrl() {
        return properties.getProperty("stationUrl");
    }

    public String getBannerClientUrl() {
        return properties.getProperty("bannerClientUrl");
    }
    public String getBannersClientUrl() {
        return properties.getProperty("bannersClientUrl");
    }
    public String getRoleClientUrl() {
        return properties.getProperty("roleClientUrl");
    }
    public String getRolesClientUrl() {
        return properties.getProperty("rolesClientUrl");
    }
    public String getNewsClientUrl() {
        return properties.getProperty("newsClientUrl");
    }
    public String getNewsListClientUrl() {
        return properties.getProperty("newsListClientUrl");
    }
    public String getNewsListSearchClientUrl() {
        return properties.getProperty("newsListSearchClientUrl");
    }

    public String getQuestionUrl() {
        return properties.getProperty("questionUrl");
    }

    public String getQuestionsUrl() {
        return properties.getProperty("questionsUrl");
    }

    public String getComplaintClientUrl(){return  properties.getProperty("complaintClientUrl");}

    public String getUserUrl() {
        return properties.getProperty("userClientURL");
    }

    public String getVerifyUrl() {
        return properties.getProperty("verifyClientURL");
    }

    public String getRegistrationUrl() {
        return properties.getProperty("registrationClientURL");
    }

    public String getTaskUrl() {
        return properties.getProperty("taskClientURL");
    }

    public String getTasksUrl() {
        return properties.getProperty("tasksClientURL");
    }

    public String getUploadImageUrl() {
        return properties.getProperty("uploadImageClientURL");
    }

    public String getDeleteFileUrl() {
        return properties.getProperty("deleteFileClientURL");
    }

    public String getJDBCLogin() {
        return properties.getProperty("jdbc_login");
    }

    public String getJDBCPassword() {
        return properties.getProperty("admin_password");
    }

    public String getJDBCUrl() {
        return properties.getProperty("jdbc_url");
    }

    public String getAdminPassword() {
        return  properties != null ? properties.getProperty("adminPassword") : System.getenv("ADMIN_PASSWORD");
    }
    public String getAdminEmail() {
        return  properties != null ? properties.getProperty("adminEmail") : System.getenv("ADMIN_EMAIL");
    }

    public String getLeaderPassword() {
        return  properties != null ? properties.getProperty("leaderPassword") : System.getenv("ADMIN_PASSWORD");
    }
    public String getLeaderEmail() {
        return  properties != null ? properties.getProperty("leaderEmail") : System.getenv("ADMIN_EMAIL");
    }

    public String getBasePassword() {
        return  properties != null ? properties.getProperty("basePassword") : System.getenv("ADMIN_PASSWORD");
    }
    public String getBaseEmail() {
        return  properties != null ? properties.getProperty("baseEmail") : System.getenv("ADMIN_EMAIL");
    }

}
