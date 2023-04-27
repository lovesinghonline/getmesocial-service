package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.Photo;
import com.example.getmesocialservice.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {
    @Autowired
    private PhotoRepository photoRepository;
    public List<Photo> getAllPhoto(){
        return photoRepository.findAll();
    }
    public Photo savePhoto(Photo photo) {
        return photoRepository.save(photo);
    }
    public Photo updatePhotoById( Photo photo) {
        return photoRepository.save(photo);
    }
    public void deletePhoto(String photoId) {
        photoRepository.deleteById(photoId);
    }

    public List<Photo> getPhotoByCreatedBy(String createdby) {
        return photoRepository.findAllByCreatedBy(createdby);
    }
}
