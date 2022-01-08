package com.ita.edu.teachua.utils;

import com.google.gson.Gson;

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
import com.ita.edu.teachua.api.models.station.StationRequestModel;
import com.ita.edu.teachua.api.models.station.StationResponseModel;
import com.ita.edu.teachua.api.models.roles.RoleModel;
import com.ita.edu.teachua.api.models.roles.RolesData;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GsonParser {
    private Gson gson;

    private AddClub addClub;
    private AddChallengeResponse addChallengeResponse;
    private PatchChallenge patchChallenge;
    private Category category;
    private Center center;

    private District districtModel;
    private BannerModel bannerModel;
    private RoleModel roleModel;
    private RolesData rolesData;
    private City city;

    private AboutUsRequestModel aboutUsRequestModel;
    private ContactModel contactModel;
    private StationRequestModel stationModel;
    private Complaint complaintModel;

    public GsonParser() {
        gson = new Gson();
    }

    public void parseAddClubJson() {
        try (FileReader reader = new FileReader("src/main/resources/request_bodies/club/addClub.json")) {
            this.addClub = gson.fromJson(reader, AddClub.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void parseAddChallengeJson() {
        try (FileReader reader = new FileReader("src/main/resources/request_bodies/challenge/addChallenge.json")) {
            this.addChallengeResponse = gson.fromJson(reader, AddChallengeResponse.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public AddChallengeResponse getAddChallengeResponse() {
        return addChallengeResponse;
    }


    public AddClub getAddClub() {
        return addClub;
    }

    public void parsePatchChallengeJson() {
        try (FileReader reader = new FileReader("src/main/resources/request_bodies/challenge/patchChallenge.json")) {
            this.patchChallenge = gson.fromJson(reader, PatchChallenge.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public PatchChallenge getPatchChallenge(){
        return patchChallenge;
    }
    public void parseAddCategoryJson() {
        try (FileReader reader = new FileReader("src/main/resources/request_bodies/category/category.json")) {
            this.category = gson.fromJson(reader, Category.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void parseAddDistrictJson() {
        try (FileReader reader = new FileReader("src/main/resources/request_body.district/district.json")) {
            this.districtModel = gson.fromJson(reader, District.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Complaint getComplaint(){return complaintModel;}
    public void parseAddComplaintJson() {
        try (FileReader reader = new FileReader("src/main/resources/request_bodies/complaint/add_complaint.json")) {
            this.complaintModel = gson.fromJson(reader, Complaint.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Category getAddCategory() {
        return category;
    }

    public void parseAddCenterJson() {
        try (FileReader reader = new FileReader("src/main/resources/request_bodies/center/center.json")) {
            this.center = gson.fromJson(reader, Center.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Center getAddCenter() {
        return center;
    }

    public District getAddDistrict() {
        return districtModel;
    }

    public void parseAddNewBannerJson() {
        try (FileReader reader = new FileReader("src/main/resources/request_bodies/banner.json/banner.json")) {
            this.bannerModel = gson.fromJson(reader, BannerModel.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public BannerModel getAddNewBanner() {
        return bannerModel;
    }

    public void parseAddNewRoleJson() {
        try (FileReader reader = new FileReader("src/main/resources/request_bodies/roles/newRole.json")) {
            this.roleModel = gson.fromJson(reader, RoleModel.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public RoleModel getAddNewRoleModel() {
        return roleModel;
    }
    public void parseRolesDataJson() {
        try (FileReader reader = new FileReader("src/main/resources/request_bodies/roles/roleManager.json")) {
            this.rolesData = gson.fromJson(reader, RolesData.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public RolesData getRolesData() {
        return rolesData;
    }


    public void parseAddNewCityJson() {
        try (FileReader reader = new FileReader("src/main/resources/request_bodies/city/city")) {
            this.city = gson.fromJson(reader, City.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public AboutUsRequestModel getAboutUsRequestModel() {
        return aboutUsRequestModel;
    }

    public void parseAddAboutUsJson() {
        try (FileReader reader = new FileReader("src/main/resources/request_bodies/about_us/about_us.json")) {
            this.aboutUsRequestModel = gson.fromJson(reader, AboutUsRequestModel.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void parseChangeAboutUsJson() {
        try (FileReader reader = new FileReader("src/main/resources/request_bodies/about_us/change_about_us.json")) {
            this.aboutUsRequestModel = gson.fromJson(reader, AboutUsRequestModel.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ContactModel getContactModel() {
        return contactModel;
    }

    public void parseAddContactJson() {
        try (FileReader reader = new FileReader("src/main/resources/request_bodies/contact/contact.json")) {
            this.contactModel = gson.fromJson(reader, ContactModel.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void parseChangeContactJson() {
        try (FileReader reader = new FileReader("src/main/resources/request_bodies/contact/change_contact.json")) {
            this.contactModel = gson.fromJson(reader, ContactModel.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public StationRequestModel getStationModel() {
        return stationModel;
    }

    public void parseAddStationJson() {
        try (FileReader reader = new FileReader("src/main/resources/request_bodies/station/station.json")) {
            this.stationModel = gson.fromJson(reader, StationRequestModel.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public City getAddNewCity() {
        return city;
    }

    public void parseChangeStationJson() {
        try (FileReader reader = new FileReader("src/main/resources/request_bodies/station/change_station.json")) {
            this.stationModel = gson.fromJson(reader, StationRequestModel.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
      
}