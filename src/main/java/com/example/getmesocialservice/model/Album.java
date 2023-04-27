package com.example.getmesocialservice.model;

import org.springframework.data.annotation.Id;

public class Album {
@Id
    private String id;
    private String name;
    private String coverUrl;
   private String createdBy;

    public String getId() {
        return id;
    }

    public Album(String id, String name, String coverUrl, String createdBy, String dateCreated) {
        this.id = id;
        this.name = name;
        this.coverUrl = coverUrl;
        this.createdBy = createdBy;
        this.dateCreated = dateCreated;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    private String dateCreated;







    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }







}
