package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.model.Photo;

import com.example.getmesocialservice.service.PhotoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@Resource
@RestController
@RequestMapping("/api/photos")
public class PhotoResource {
    @Autowired
    private PhotoService photoService;
    @PostMapping
    public Photo savePhoto(@RequestBody @Valid Photo photo){
        return photoService.savePhoto(photo);
    }
    @GetMapping()
    public List<Photo> getAllPhoto()
    {
        return photoService.getAllPhoto();
    }
    @PutMapping()
    public Photo updatePhotoById(@RequestBody @Valid Photo photo){
        return photoService. updatePhotoById(photo);
    }
    @DeleteMapping
    public void deletePhoto(@RequestParam( name = "photoId") String photoId){
        photoService.deletePhoto(photoId);
    }
    @GetMapping("/find")
    public List<Photo> getPhotoByCreatedBy(@RequestParam(name ="CreatedBy") String createdby)
    {return photoService. getPhotoByCreatedBy(createdby);
    }
}
