package com.example.getmesocialservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;


public class User {
@Id
    private String id;
    private  String name;
    @Email
    private String eamil;
    @NotEmpty
    private String profilePicUrl;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEamil() {
        return eamil;
    }
    public void setEamil(String eamil) {
        this.eamil = eamil;
    }
    public String getProfilePicUrl() {
        return profilePicUrl;
    }
    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}

