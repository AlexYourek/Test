package com.hibernate.demo.repository;
import com.hibernate.demo.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongRepository extends JpaRepository<Song, Long> {
    List<Song> findAll();
    //static Song save(Song song);
    //Song findByArtist(String artist);
    //Song findByDuration(Int duration);
//    Song findByEmailAndName(String email, String name);
  //  List<Song> findByNameContaining(String name);
}

