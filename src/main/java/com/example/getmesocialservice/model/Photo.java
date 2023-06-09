package com.example.getmesocialservice.model;

import com.example.getmesocialservice.validation.ValidName;
import org.springframework.data.annotation.Id;

public class Photo {
    @Id
    private String id;
    private String albumId;
    @ValidName
    private String createdBy;
    private String dateCreated;

    public Photo( String albumId, String createdBy, String dateCreated) {
        this.albumId = albumId;
        this.createdBy = createdBy;
        this.dateCreated = dateCreated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
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
}
