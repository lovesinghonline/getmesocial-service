package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.model.Album;
import com.example.getmesocialservice.model.User;
import com.example.getmesocialservice.service.AlbumService;
import com.example.getmesocialservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
@Resource
@RestController
@RequestMapping("/api/albums")
public class AlbumResource {
    @Autowired
    private AlbumService albumService;
    @PostMapping
    public Album saveAlbum(@RequestBody Album album){
        return  albumService.saveAlbum(album);
    }
    @GetMapping()
    public List<Album> getAllAlbum()
    {
        return albumService.getAllAlbum();
    }
    @PutMapping()
    public Album updateAlbumById(@RequestBody Album album){
        return albumService. updateAlbumById(album);
    }
    @DeleteMapping
    public void deleteAlbum(@RequestParam( name = "albumId") String albumId){
        albumService.deleteAlbum(albumId);
    }
    @GetMapping("/find")
    public List<Album> getAlbumByName(@RequestParam(name ="name") String name)
    {return albumService. getAlbumByName(name);
    }

}
