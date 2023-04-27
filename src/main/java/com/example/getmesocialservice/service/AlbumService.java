package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.Album;
import com.example.getmesocialservice.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service


public class AlbumService {
    @Autowired
    private AlbumRepository albumRepository;
    public void deleteAlbum(String albumId) {
        albumRepository.deleteById(albumId);

    }

    public Album updateAlbumById(Album album) {
        return albumRepository.save(album);
    }

    public List<Album> getAllAlbum() {
        return albumRepository.findAll();
    }

    public List<Album> getAlbumByName(String name) {
        return albumRepository.findAllByName(name);
    }

    public Album saveAlbum(Album album) {
        return albumRepository.save(album);
    }

}
