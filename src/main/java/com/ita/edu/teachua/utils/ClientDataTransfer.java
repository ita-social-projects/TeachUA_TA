package com.ita.edu.teachua.utils;


import com.ita.edu.teachua.api.models.about_us.AboutUsRequestModel;
import com.ita.edu.teachua.api.models.banner.BannerModel;
import com.ita.edu.teachua.api.models.challenge.patch.PatchChallenge;
import com.ita.edu.teachua.api.models.challenge.response.AddChallengeResponse;
import com.ita.edu.teachua.api.models.city.city_request.City;
import com.ita.edu.teachua.api.models.category.Category;
import com.ita.edu.teachua.api.models.center.center_request.Center;
import com.ita.edu.teachua.api.models.club.add_club_request.AddClub;
import com.ita.edu.teachua.api.models.club.add_club_response.District;
import com.ita.edu.teachua.api.models.complaint.Complaint;
import com.ita.edu.teachua.api.models.contact.ContactModel;
import com.ita.edu.teachua.api.models.news.NewsModel;
import com.ita.edu.teachua.api.models.roles.RoleModel;
import com.ita.edu.teachua.api.models.station.StationModel;
import com.ita.edu.teachua.api.models.station.StationRequestModel;
import com.ita.edu.teachua.api.models.roles.RoleModel;
import com.ita.edu.teachua.api.models.roles.RolesData;
import com.ita.edu.teachua.api.models.registration.RegisterUser;
import com.ita.edu.teachua.api.models.user.SuccessUpdatedUser;

public class ClientDataTransfer {
    GsonParser parser;

    public AddClub getAddClub() {
        parser = new GsonParser();
        parser.parseAddClubJson();
        return parser.getAddClub();
    }

    public AddChallengeResponse getAddChallenge() {
        parser = new GsonParser();
        parser.parseAddChallengeJson();
        return parser.getAddChallengeResponse();
    }
    public PatchChallenge getPatchChallenge(){
        parser=new GsonParser();
        parser.parsePatchChallengeJson();
        return parser.getPatchChallenge();
    }

    public Category getAddCategory() {
        parser = new GsonParser();
        parser.parseAddCategoryJson();
        return parser.getAddCategory();
    }

    public Complaint getAddComplaint(){
        parser=new GsonParser();
        parser.parseAddComplaintJson();
        return parser.getComplaint();
    }
    public District getAddDistrict() {
        parser = new GsonParser();
        parser.parseAddDistrictJson();
        return parser.getAddDistrict();
    }

    public Center getAddCenter() {
        parser = new GsonParser();
        parser.parseAddCenterJson();
        return parser.getAddCenter();
    }

    public BannerModel getAddBanner() {
        parser = new GsonParser();
        parser.parseAddNewBannerJson();
        return parser.getAddNewBanner();
    }
    public BannerModel getAddBannerWithWrongPath() {
        parser = new GsonParser();
        parser.parseAddBannerWithWrongPathJson();
        return parser.getAddBannerWithWrongPath();
    }

    public RoleModel getAddRole() {
        parser = new GsonParser();
        parser.parseAddNewRoleJson();
        return parser.getAddNewRoleModel();
    }
    public NewsModel getAddNews() {
        parser = new GsonParser();
        parser.parseAddNewsJson();
        return parser.getNewsModel();
    }

    public City getAddCity() {
        parser = new GsonParser();
        parser.parseAddNewBannerJson();
        return parser.getAddNewCity();
    }

    public AboutUsRequestModel getAddAboutUs() {
        parser = new GsonParser();
        parser.parseAddAboutUsJson();
        return parser.getAboutUsRequestModel();
    }

    public AboutUsRequestModel getChangeAboutUs() {
        parser = new GsonParser();
        parser.parseChangeAboutUsJson();
        return parser.getAboutUsRequestModel();
    }

    public ContactModel getAddContact() {
        parser = new GsonParser();
        parser.parseAddContactJson();
        return parser.getContactModel();
    }

    public ContactModel getChangeContact() {
        parser = new GsonParser();
        parser.parseChangeContactJson();
        return parser.getContactModel();
    }

    public StationRequestModel getAddStation() {
        parser = new GsonParser();
        parser.parseAddAboutUsJson();
        return parser.getStationModel();
    }

    public StationRequestModel getChangeStation() {
        parser = new GsonParser();
        parser.parseChangeStationJson();
        return parser.getStationModel();
    }

    public RegisterUser getRegisterUser(){
        parser = new GsonParser();
        parser.parseRegisterUserJson();
        return parser.getRegisterUser();
    }

    public SuccessUpdatedUser getUpdateUser(){
        parser = new GsonParser();
        parser.parseUpdateUserJson();
        return parser.getUpdateUser();
    }
}