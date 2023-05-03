package com.example.getmesocialservice.model;

import com.example.getmesocialservice.validation.ValidName;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.Max;

public class Comment {
    @Id
    private String id;
private String photoId;
@Max(5)
private String message;
@ValidName
private String createdBy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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

    public Comment(String photoId, String message, String createdBy, String dateCreated) {

        this.photoId = photoId;
        this.message = message;
        this.createdBy = createdBy;
        this.dateCreated = dateCreated;
    }

    private String dateCreated;

}
