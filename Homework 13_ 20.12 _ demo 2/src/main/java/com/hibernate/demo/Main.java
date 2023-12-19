package com.hibernate.demo;

import com.hibernate.demo.entity.*;
import com.hibernate.demo.repository.AlbumRepository;
import com.hibernate.demo.repository.SongRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Main {
    private final SongRepository songRepository;
    private final AlbumRepository albumRepository;

    @Autowired
    public Main(SongRepository songRepository, AlbumRepository albumRepository) {
        this.songRepository = songRepository;
        this.albumRepository = albumRepository;
    }
/*    public Main(UserRepository userRepository, AddressRepository addressRepository) {
        this.userRepository = userRepository;
        this.addressRepository = addressRepository;
    }*/

    @PostConstruct
    public void start() {

        Album newAlbum = new Album("Jose Feliciano", 1970, "Feliz Navidad");
        albumRepository.save(newAlbum);

        Song song1 = new Song("Jose Feliciano", 182, "Feliz Navidad");
        song1.setAlbum(newAlbum);
        songRepository.save(song1);

        /*Album newAlbum = new Album("Jose Feliciano", 1970, "Feliz Navidad");
        albumRepository.save(newAlbum);
        Album newAlbum2 = new Album("George Michael", 1984, "Music from the Edge of Heaven");
        albumRepository.save(newAlbum2);
        Album newAlbum3 = new Album("Mariah Carey", 1994, "Merry Christmas");
        albumRepository.save(newAlbum3);

        Song newSong = new Song("George Michael", 189, "Last Christmas");
        songRepository.save(newSong);
        Song newSong2 = new Song("Mariah Carey", 241, "All I Want for Christmas Is You");
        songRepository.save(newSong2);
        Song newSong3 = new Song("Jose Feliciano", 182, "Feliz Navidad");
        songRepository.save(newSong3);*/
/*
        User user = userRepository.findAll().get(0);
        Address address = user.getAddress();

        if (address != null) {
            user.setAddress(null);
            userRepository.save(user);
            addressRepository.delete(address);
        }

        System.out.println("Song: " + user);
*/
    }
}
